package sspc.gob.mx.psr.services;

import sspc.gob.mx.psr.dto.MunicipioDto;
import sspc.gob.mx.psr.model.Estado;
import sspc.gob.mx.psr.model.Municipio;

import java.util.List;

public interface MunicipioService {
    List<MunicipioDto> muncipiosPorEstado(Estado estado);
    Municipio busca(Long id);
}
