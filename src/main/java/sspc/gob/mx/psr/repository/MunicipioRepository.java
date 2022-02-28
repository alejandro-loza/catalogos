package sspc.gob.mx.psr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sspc.gob.mx.psr.model.Estado;
import sspc.gob.mx.psr.model.Municipio;

import java.util.List;

@Repository
public interface MunicipioRepository  extends JpaRepository<Municipio, Long> {
    List<Municipio> findAllByEstado(Estado estado);
    List<Municipio> findAllByEstadoAndActivoOrderByNombreAsc(Estado estado, boolean activo);

}
