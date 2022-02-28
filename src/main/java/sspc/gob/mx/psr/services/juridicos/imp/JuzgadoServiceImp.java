package sspc.gob.mx.psr.services.juridicos.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sspc.gob.mx.psr.dto.JuzgadoDto;
import sspc.gob.mx.psr.exeptions.ItemNotFoundException;
import sspc.gob.mx.psr.model.juridicos.Juzgado;
import sspc.gob.mx.psr.repository.juridicos.JuzgadoRepository;
import sspc.gob.mx.psr.services.juridicos.JuzgadoService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JuzgadoServiceImp implements JuzgadoService {

    @Autowired
    JuzgadoRepository juzgadoRepository;

    @Override
    public Juzgado buscaJuzgado(Long id) {
        return juzgadoRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException("juzgado.notFound") );
    }

    @Override
    public List<JuzgadoDto> lista(){
        return juzgadoRepository.findAllByActivoOrderByNombreAsc(true)
                .stream().map(JuzgadoDto::new).collect(Collectors.toList());
    }

}
