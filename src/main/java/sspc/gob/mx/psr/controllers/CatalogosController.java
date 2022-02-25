package sspc.gob.mx.psr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sspc.gob.mx.psr.dto.EstadoDto;
import sspc.gob.mx.psr.services.*;
import sspc.gob.mx.psr.services.DelitoService;

@RequestMapping("/catalogos")
@RestController
public class CatalogosController {

    @Autowired
    EstadoService estadoService;

    @Autowired
    EstadoCivilService estadoCivilService;

    @Autowired
    MunicipioService municipioService;

    @Autowired
    EscolaridadService escolaridadService;

    @Autowired
    EtniaService etniaService;

    @Autowired
    OcupacionService ocupacionService;

    @Autowired
    ParentescoService parentescoService;

    @Autowired
    PaisService paisService;

    @Autowired
    AsuntoService asuntoService;

    @Autowired
    BeneficioService beneficioService;

    @Autowired
    DelitoService delitoService;

    @Autowired
    DestinatarioService destinatarioService;

    @Autowired
    EstatusService estatusService;

    @GetMapping(path = "/pais", produces = "application/json")
    ResponseEntity paises() {
        return new ResponseEntity<>( paisService.lista(), HttpStatus.OK);
    }

    @GetMapping(path = "/escolaridad", produces = "application/json")
    ResponseEntity escolaridad() {
        return new ResponseEntity<>( escolaridadService.lista(), HttpStatus.OK);
    }

    @GetMapping(path = "/estado", produces = "application/json")
    ResponseEntity estados() {
        return new ResponseEntity<>( estadoService.lista(), HttpStatus.OK);
    }

    @GetMapping(path = "/estado/{estadoId}", produces = "application/json")
    ResponseEntity estado(@PathVariable("estadoId") Long estadoId) {
        return new ResponseEntity<>( new EstadoDto( estadoService.busca(estadoId)), HttpStatus.OK);
    }

    @GetMapping(path="/estado/{estadoId}/municipio", produces = "application/json")
    ResponseEntity municipios(@PathVariable("estadoId") Long estadoId) {
        return new ResponseEntity<>( municipioService.muncipiosPorEstado(estadoService.busca(estadoId)), HttpStatus.OK);
    }

    @GetMapping(path="/municipio/{municipioId}", produces = "application/json")
    ResponseEntity municipio( @PathVariable("municipioId") Long municipioId) {
        return new ResponseEntity<>( municipioService.busca(municipioId), HttpStatus.OK);
    }

    @GetMapping(path = "/estadoCivil", produces = "application/json")
    ResponseEntity estadoCivil() {
        return new ResponseEntity<>( estadoCivilService.lista(), HttpStatus.OK);
    }

    @GetMapping(path = "/etnia", produces = "application/json")
    ResponseEntity etnias() {
        return new ResponseEntity<>( etniaService.lista(), HttpStatus.OK);
    }

    @GetMapping(path = "/ocupacion", produces = "application/json")
    ResponseEntity ocupaciones() {
        return new ResponseEntity<>( ocupacionService.lista(), HttpStatus.OK);
    }

    @GetMapping(path = "/parentesco", produces = "application/json")
    ResponseEntity parentescos() {
        return new ResponseEntity<>( parentescoService.lista(), HttpStatus.OK);
    }

    @GetMapping(path = "/asunto", produces = "application/json")
    ResponseEntity asunto() { return new ResponseEntity<>( asuntoService.lista(), HttpStatus.OK); }

    @GetMapping(path = "/beneficio", produces = "application/json")
    ResponseEntity beneficio() { return new ResponseEntity<>( beneficioService.lista(), HttpStatus.OK); }

    @GetMapping(path = "/delito", produces = "application/json")
    ResponseEntity delito() { return new ResponseEntity<>( delitoService.lista(), HttpStatus.OK); }

    @GetMapping(path = "/destinatario", produces = "application/json")
    ResponseEntity destinatario() { return new ResponseEntity<>( destinatarioService.lista(), HttpStatus.OK); }

    @GetMapping(path = "/estatus", produces = "application/json")
    ResponseEntity estatus() { return new ResponseEntity<>( estatusService.lista(), HttpStatus.OK); }



}
