package sspc.gob.mx.psr.dto;

import lombok.Data;
import sspc.gob.mx.psr.model.juridicos.Destinatario;

@Data
public class DestinatarioDto {
    public Long id;
    public String nombre;

    public DestinatarioDto(Destinatario destinatario){
        super();
        this.id = destinatario.id;
        this.nombre = destinatario.nombre;
    }
}
