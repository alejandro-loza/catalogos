package sspc.gob.mx.psr.repository.juridicos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sspc.gob.mx.psr.model.juridicos.CentroReclusion;

import java.util.List;
import java.util.Optional;

@Repository
public interface CentroReclusionRepository extends JpaRepository<CentroReclusion, Long> {
    List<CentroReclusion> findAllByActivoOrderByNombreAsc(boolean activo);
    Optional<CentroReclusion> findByIdAndActivo(Long id, boolean activo);
}
