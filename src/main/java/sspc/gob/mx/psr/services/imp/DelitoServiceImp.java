package sspc.gob.mx.psr.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sspc.gob.mx.psr.dto.DelitoDto;
import sspc.gob.mx.psr.exeptions.ItemNotFoundException;
import sspc.gob.mx.psr.model.juridicos.Delito;
import sspc.gob.mx.psr.repository.DelitoRepository;
import sspc.gob.mx.psr.services.DelitoService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DelitoServiceImp implements DelitoService {

    @Autowired
    DelitoRepository delitoRepository;

    @Override
    public List<DelitoDto> lista(){
        return delitoRepository.findAll()
                .stream().map(DelitoDto::new).collect(Collectors.toList());
    }

    @Override
    public Delito busca(Long id){
        return delitoRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException("delito.notFound") );
    }
}
