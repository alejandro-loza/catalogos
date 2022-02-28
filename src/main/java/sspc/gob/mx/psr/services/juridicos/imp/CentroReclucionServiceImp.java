package sspc.gob.mx.psr.services.juridicos.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sspc.gob.mx.psr.dto.CentroReclusionDto;
import sspc.gob.mx.psr.exeptions.ItemNotFoundException;
import sspc.gob.mx.psr.model.juridicos.CentroReclusion;
import sspc.gob.mx.psr.repository.juridicos.CentroReclusionRepository;
import sspc.gob.mx.psr.services.juridicos.CentroReclusionService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CentroReclucionServiceImp implements CentroReclusionService {
    @Autowired
    CentroReclusionRepository centroReclusionRepository;

    @Override
    public CentroReclusion busca(Long id) throws ItemNotFoundException {
        return centroReclusionRepository.findByIdAndActivo(id, true)
                .orElseThrow(() -> new ItemNotFoundException("centroReclusion.notFound") );
    }

    @Override
    public List<CentroReclusionDto> lista(){
        return centroReclusionRepository.findAllByActivoOrderByNombreAsc(true)
                .stream().map(CentroReclusionDto::new).collect(Collectors.toList());
    }

}
