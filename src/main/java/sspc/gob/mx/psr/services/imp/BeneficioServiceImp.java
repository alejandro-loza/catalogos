package sspc.gob.mx.psr.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sspc.gob.mx.psr.dto.BeneficioDto;
import sspc.gob.mx.psr.exeptions.ItemNotFoundException;
import sspc.gob.mx.psr.model.juridicos.Beneficio;
import sspc.gob.mx.psr.repository.BeneficioRepository;
import sspc.gob.mx.psr.services.BeneficioService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BeneficioServiceImp implements BeneficioService {
    @Autowired
    BeneficioRepository beneficioRepository;

    @Override
    public List<BeneficioDto> lista(){
        return beneficioRepository.findAll()
                .stream().map(BeneficioDto::new).collect(Collectors.toList());
    }

    @Override
    public Beneficio busca(Long id){
        return beneficioRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException("beneficio.notFound") );
    }
}
