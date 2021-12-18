package sspc.gob.mx.psr.validator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalTime;

@RequiredArgsConstructor
@Getter
@Setter
public class SentenciadoValidador {
    @NotNull(message= "sentenced.name.null")
    @NotBlank
    @Size(min = 1, max = 100)
    String nombre;

    @NotBlank
    @Size(min = 1, max = 100)
    String apellidoPaterno;

    @NotBlank
    @Size(min = 1, max = 100)
    String apellidoMaterno;

    @Size(min = 1, max = 100)
    @NotNull
    @NotBlank
    String nacionalidad;

    @NotNull
    @NotBlank
    @Size(min = 18, max = 18)
    String curp;

    @NotNull
    @NotBlank
    @Size(min = 1, max = 100)
    String estadoCivil;

    @NotBlank
    @Size(min = 1, max = 100)
    String alias;

    @NotBlank
    @Size(min = 1, max = 100)
    String otrosNombres;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @NotNull
    LocalDate fechaNacimiento;

    @NotBlank
    @Size(min = 1, max = 100)
    String ocupacion;

    @NotNull
    @NotBlank
    String sexo;

    @NotNull
    @NotBlank
    @Size(min = 1, max = 20)
    String etnia;

    @NotNull
    @NotBlank
    @Size(min = 1, max = 50)
    String escolaridad;

    @NotNull
    @NotBlank
    @Size(min = 1, max = 50)
    String telefonoFijo;

    @NotNull
    @NotBlank
    @Size(min = 1, max = 50)
    String celular;

    @Email
    @NotNull
    @NotBlank
    String  email;
}
