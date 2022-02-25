package sspc.gob.mx.psr.services.juridicos.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sspc.gob.mx.psr.dto.CentroReclucionDto;
import sspc.gob.mx.psr.exeptions.ItemNotFoundException;
import sspc.gob.mx.psr.model.juridicos.CentroReclucion;
import sspc.gob.mx.psr.repository.juridicos.CentroReclucionRepository;
import sspc.gob.mx.psr.services.juridicos.CentroReclucionService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CentroReclucionServiceImp implements CentroReclucionService {
    @Autowired
    CentroReclucionRepository centroReclucionRepository;

    @Override
    public CentroReclucion busca(Long id) throws ItemNotFoundException {
        return centroReclucionRepository.findByIdAndActivo(id, true)
                .orElseThrow(() -> new ItemNotFoundException("centroReclucion.notFound") );
    }

    @Override
    public List<CentroReclucionDto> lista(){
        return centroReclucionRepository.findAllByActivo(true)
                .stream().map(CentroReclucionDto::new).collect(Collectors.toList());
    }

}
