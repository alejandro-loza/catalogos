package sspc.gob.mx.psr.services;

import sspc.gob.mx.psr.dto.DestinatarioDto;
import sspc.gob.mx.psr.model.juridicos.Destinatario;

import java.util.List;

public interface DestinatarioService {
    List<DestinatarioDto> lista();
    Destinatario busca(Long id);

}
