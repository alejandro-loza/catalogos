package sspc.gob.mx.psr.dto;

import lombok.Getter;
import lombok.Setter;
import sspc.gob.mx.psr.model.Sentenciado;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Getter
@Setter
public class SentenciadoDto {

    String id;

    String folio;

    String nombre;

    String apellidoPaterno;

    String apellidoMaterno;

    String nacionalidad;

    String curp;

    String estadoCivil;

    String alias;

    String otrosNombres;

    LocalDate fechaNacimiento;

    String ocupacion;

    String sexo;

    String etnia;

    String escolaridad;

    String telefonoFijo;

    String celular;

    String  email;


    public SentenciadoDto(Sentenciado sentenciado){
        this.id = sentenciado.getId().toString();
        this.folio = sentenciado.getFolio().toString();
        this.nombre = sentenciado.getNombre();
        this.apellidoPaterno = sentenciado.getApellidoPaterno();
        this.apellidoMaterno = sentenciado.getApellidoMaterno();
        this.nacionalidad = sentenciado.getNacionalidad().getNombre();
        this.curp = sentenciado.getCurp();
        this.estadoCivil = sentenciado.getEstadoCivil();
        this.alias = sentenciado.getAlias();
        this.otrosNombres = sentenciado.getOtrosNombres();
        this.fechaNacimiento = sentenciado.getFechaNacimiento();
        this.ocupacion = sentenciado.getOcupacion();
        this.sexo = sentenciado.getSexo().toString();
        this.etnia = sentenciado.getEtnia();
        this.escolaridad = sentenciado.getEscolaridad();
        this.telefonoFijo = sentenciado.getTelefonoFijo();
        this.celular = sentenciado.getCelular();
        this.email = sentenciado.getEmail();
    }

}
