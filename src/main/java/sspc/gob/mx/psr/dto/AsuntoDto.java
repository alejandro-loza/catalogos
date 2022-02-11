package sspc.gob.mx.psr.dto;

import lombok.Data;
import sspc.gob.mx.psr.model.juridicos.Asunto;

@Data
public class AsuntoDto {
    public Long id;
    public String nombre;

    public AsuntoDto(Asunto asunto){
        super();
        this.id = asunto.getId();
        this.nombre = asunto.getNombre();
    }
}
