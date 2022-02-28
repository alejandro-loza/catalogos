package sspc.gob.mx.psr.services.juridicos;

import sspc.gob.mx.psr.dto.JuzgadoDto;
import sspc.gob.mx.psr.model.juridicos.Juzgado;

import java.util.List;

public interface JuzgadoService {
    Juzgado buscaJuzgado(Long id);
    List<JuzgadoDto> lista();
}
