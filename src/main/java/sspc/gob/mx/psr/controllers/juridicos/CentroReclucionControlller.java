package sspc.gob.mx.psr.controllers.juridicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sspc.gob.mx.psr.dto.CentroReclucionDto;
import sspc.gob.mx.psr.services.juridicos.CentroReclucionService;

@RequestMapping("/catalogos")
@RestController
public class CentroReclucionControlller {
    @Autowired
    CentroReclucionService centroReclucionService;

    @GetMapping(path = "/centrosReclucion/{id}", produces = "application/json")
    ResponseEntity busca(@PathVariable("id") Long id) {
        return new ResponseEntity<>( new CentroReclucionDto( centroReclucionService.busca(id)), HttpStatus.OK);
    }

    @GetMapping(path = "/centrosReclucion", produces = "application/json")
    ResponseEntity lista() {
        return new ResponseEntity<>( centroReclucionService.lista(), HttpStatus.OK);
    }
}
