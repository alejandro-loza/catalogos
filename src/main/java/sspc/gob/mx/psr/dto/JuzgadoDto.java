package sspc.gob.mx.psr.dto;

import lombok.Data;
import sspc.gob.mx.psr.model.juridicos.Juzgado;

@Data
public class JuzgadoDto {
    public Long id;
    public String nombre;

    public JuzgadoDto(Juzgado juzgado){
        super();
        this.id = juzgado.getId();
        this.nombre = juzgado.getNombre();
    }
}
