package sspc.gob.mx.psr.services.juridicos;

import sspc.gob.mx.psr.dto.CentroReclusionDto;
import sspc.gob.mx.psr.exeptions.ItemNotFoundException;
import sspc.gob.mx.psr.model.juridicos.CentroReclusion;

import java.util.List;

public interface CentroReclusionService {
    CentroReclusion busca(Long id) throws ItemNotFoundException;

    List<CentroReclusionDto> lista();
}
