package sspc.gob.mx.psr.services;
import sspc.gob.mx.psr.dto.AsuntoDto;
import sspc.gob.mx.psr.model.juridicos.Asunto;

import java.util.List;

public interface AsuntoService {
    List<AsuntoDto> lista();
    Asunto busca (Long id);
}
