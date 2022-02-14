package sspc.gob.mx.psr.dto;

import lombok.Data;
import sspc.gob.mx.psr.model.juridicos.Delito;

@Data
public class DelitoDto {
    public Long id;
    public String nombre;

    public DelitoDto(Delito delito){
        super();
        this.id = delito.getId();
        this.nombre = delito.getNombre();
    }
}
