package sspc.gob.mx.psr.controllers.juridicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sspc.gob.mx.psr.dto.CentroReclusionDto;
import sspc.gob.mx.psr.services.juridicos.CentroReclusionService;

@RequestMapping("/catalogos")
@RestController
public class CentroReclusionControlller {
    @Autowired
    CentroReclusionService centroReclusionService;

    @GetMapping(path = "/centrosReclusion/{id}", produces = "application/json")
    ResponseEntity busca(@PathVariable("id") Long id) {
        return new ResponseEntity<>( new CentroReclusionDto( centroReclusionService.busca(id)), HttpStatus.OK);
    }

    @GetMapping(path = "/centrosReclusion", produces = "application/json")
    ResponseEntity lista() {
        return new ResponseEntity<>( centroReclusionService.lista(), HttpStatus.OK);
    }
}
