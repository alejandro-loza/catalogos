package sspc.gob.mx.psr.services;

import sspc.gob.mx.psr.dto.DelitoDto;
import sspc.gob.mx.psr.model.juridicos.Delito;

import java.util.List;

public interface DelitoService {
    List<DelitoDto> lista();
    Delito busca (Long id);
}
