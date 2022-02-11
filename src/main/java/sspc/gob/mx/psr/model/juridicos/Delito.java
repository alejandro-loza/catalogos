package sspc.gob.mx.psr.model.juridicos;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Getter
@Table(name = "cat_delito")
public class Delito {
    @Id
    @GeneratedValue
    @Column(name = "id_cat_delito")
    public Long id;

    @NotNull
    @NotBlank
    @Size(min = 1, max = 30)
    public String nombre;

    @Size(min = 1, max = 50)
    public String descripcion;

    @NotNull
    public boolean activo = true;
}
