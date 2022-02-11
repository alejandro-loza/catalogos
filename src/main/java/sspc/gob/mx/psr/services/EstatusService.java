package sspc.gob.mx.psr.services;

import sspc.gob.mx.psr.dto.EstatusDto;
import sspc.gob.mx.psr.model.juridicos.Estatus;

import java.util.List;

public interface EstatusService {
    List<EstatusDto> lista();
    Estatus busca(Long id);
}
