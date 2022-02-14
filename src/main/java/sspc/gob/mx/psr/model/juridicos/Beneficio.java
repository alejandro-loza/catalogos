package sspc.gob.mx.psr.model.juridicos;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Getter
@Table(name = "cat_beneficio")
public class Beneficio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cat_beneficio", updatable = false, nullable = false)
    private Long id;

    @NotNull
    @NotBlank
    @Size(min = 1, max = 30)
    public String nombre;

    @Size(min = 1, max = 50)
    public String descripcion;

    @NotNull
    public boolean activo = true;
}
