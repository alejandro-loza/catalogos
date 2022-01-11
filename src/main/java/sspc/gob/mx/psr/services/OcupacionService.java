package sspc.gob.mx.psr.services;

import sspc.gob.mx.psr.dto.OcupacionDto;
import sspc.gob.mx.psr.model.Ocupacion;

import java.util.List;

public interface OcupacionService {
    List<OcupacionDto> lista();

    Ocupacion busca(Long id);
}
