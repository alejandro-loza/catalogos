package sspc.gob.mx.psr.dto;

import lombok.Data;
import sspc.gob.mx.psr.model.juridicos.CentroReclusion;

@Data
public class CentroReclusionDto {

    public Long id;
    public String nombre;

    public CentroReclusionDto(CentroReclusion centroReclucion){
        super();
        this.id = centroReclucion.getId();
        this.nombre = centroReclucion.getNombre();
    }
}
