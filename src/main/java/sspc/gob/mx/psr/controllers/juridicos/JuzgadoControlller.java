package sspc.gob.mx.psr.controllers.juridicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sspc.gob.mx.psr.dto.CentroReclusionDto;
import sspc.gob.mx.psr.dto.JuzgadoDto;
import sspc.gob.mx.psr.services.juridicos.JuzgadoService;

@RequestMapping("/catalogos/juzgados")
@RestController
public class JuzgadoControlller {
    @Autowired
    JuzgadoService juzgadoService;

    @GetMapping(path = "/{id}", produces = "application/json")
    ResponseEntity busca(@PathVariable("id") Long id) {
        return new ResponseEntity<>( new JuzgadoDto( juzgadoService.buscaJuzgado(id)), HttpStatus.OK);
    }

    @GetMapping( produces = "application/json")
    ResponseEntity lista() {
        return new ResponseEntity<>( juzgadoService.lista(), HttpStatus.OK);
    }

}
