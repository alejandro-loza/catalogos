package sspc.gob.mx.psr.dto;

import lombok.Data;
import sspc.gob.mx.psr.model.juridicos.CentroReclucion;

@Data
public class CentroReclucionDto {

    public Long id;
    public String nombre;

    public CentroReclucionDto(CentroReclucion centroReclucion){
        super();
        this.id = centroReclucion.getId();
        this.nombre = centroReclucion.getNombre();
    }
}
