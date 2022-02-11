package sspc.gob.mx.psr.model.juridicos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Getter
@Setter
@Table(name = "cat_asunto")
public class Asunto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cat_asunto")
    public Long id;

    @NotNull
    @NotBlank
    @Size(min = 1, max = 30)
    private String nombre;

    @Size(min = 1, max = 300)
    private String descripcion;

    @NotNull
    private boolean activo = true;
}
