package sspc.gob.mx.psr.model.juridicos;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "cat_centro_reclusion")
public class CentroReclucion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cat_centro_reclusion")
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
