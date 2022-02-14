package sspc.gob.mx.psr.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sspc.gob.mx.psr.dto.AsuntoDto;
import sspc.gob.mx.psr.exeptions.ItemNotFoundException;
import sspc.gob.mx.psr.model.juridicos.Asunto;
import sspc.gob.mx.psr.repository.AsuntoRepository;
import sspc.gob.mx.psr.services.AsuntoService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AsuntoServiceImp implements AsuntoService {

    @Autowired
    AsuntoRepository asuntoRepository;

    @Override
    public List<AsuntoDto> lista(){
        return asuntoRepository.findAllByActivo(true)
                .stream().map(AsuntoDto::new).collect(Collectors.toList());
    }

    @Override
    public Asunto busca(Long id){
        return asuntoRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException("asunto.notFound") );
    }
}
