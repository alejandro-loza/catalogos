package sspc.gob.mx.psr.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sspc.gob.mx.psr.dto.DestinatarioDto;
import sspc.gob.mx.psr.exeptions.ItemNotFoundException;
import sspc.gob.mx.psr.model.juridicos.Destinatario;
import sspc.gob.mx.psr.repository.DestinatarioRepository;
import sspc.gob.mx.psr.services.DestinatarioService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DestinatarioServiceImp implements DestinatarioService {

    @Autowired
    DestinatarioRepository destinatarioRepository;

    @Override
    public List<DestinatarioDto> lista(){
        return destinatarioRepository.findAllByActivo(true)
                .stream().map(DestinatarioDto::new).collect(Collectors.toList());
    }

    @Override
    public Destinatario busca(Long id) {
        return destinatarioRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException("destinatario.notFound") );
    }
}
