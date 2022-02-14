package sspc.gob.mx.psr.dto;

import lombok.Data;
import sspc.gob.mx.psr.model.juridicos.Estatus;

@Data
public class EstatusDto {
    public Long id;
    public String nombre;

    public EstatusDto(Estatus estatus){
        super();
        this.id = estatus.getId();
        this.nombre = estatus.getNombre();
    }
}
