package sspc.gob.mx.psr.dto;

import lombok.Data;
import sspc.gob.mx.psr.model.juridicos.Beneficio;

@Data
public class BeneficioDto {
    public Long id;
    public String nombre;

    public BeneficioDto(Beneficio beneficio){
        super();
        this.id = beneficio.getId();
        this.nombre = beneficio.getNombre();
    }
}
