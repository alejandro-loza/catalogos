package sspc.gob.mx.psr.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sspc.gob.mx.psr.dto.EstatusDto;
import sspc.gob.mx.psr.exeptions.ItemNotFoundException;
import sspc.gob.mx.psr.model.juridicos.Estatus;
import sspc.gob.mx.psr.repository.EstatusRepository;
import sspc.gob.mx.psr.services.EstatusService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstatusServiceImp implements EstatusService {

    @Autowired
    EstatusRepository estatusRepository;

    @Override
    public List<EstatusDto> lista(){
        return estatusRepository.findAll()
                .stream().map(EstatusDto::new).collect(Collectors.toList());
    }

    @Override
    public Estatus busca(Long id){
        return estatusRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException("estatus.notFound") );
    }
}
