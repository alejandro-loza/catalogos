package sspc.gob.mx.psr.services.juridicos;

import sspc.gob.mx.psr.dto.CentroReclucionDto;
import sspc.gob.mx.psr.exeptions.ItemNotFoundException;
import sspc.gob.mx.psr.model.juridicos.CentroReclucion;

import java.util.List;

public interface CentroReclucionService {
    CentroReclucion busca(Long id) throws ItemNotFoundException;

    List<CentroReclucionDto> lista();
}
