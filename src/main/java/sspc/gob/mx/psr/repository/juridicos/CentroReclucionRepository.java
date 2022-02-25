package sspc.gob.mx.psr.repository.juridicos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sspc.gob.mx.psr.model.juridicos.CentroReclucion;

import java.util.List;
import java.util.Optional;

@Repository
public interface CentroReclucionRepository extends JpaRepository<CentroReclucion, Long> {
    List<CentroReclucion> findAllByActivo(boolean activo);
    Optional<CentroReclucion> findByIdAndActivo(Long id, boolean activo);
}
