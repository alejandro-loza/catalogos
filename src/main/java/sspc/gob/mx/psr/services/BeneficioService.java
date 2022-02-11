package sspc.gob.mx.psr.services;

import sspc.gob.mx.psr.dto.BeneficioDto;
import sspc.gob.mx.psr.model.juridicos.Beneficio;

import java.util.List;

public interface BeneficioService {
    List<BeneficioDto> lista();
    Beneficio busca (Long id);
}
