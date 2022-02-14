package sspc.gob.mx.psr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sspc.gob.mx.psr.model.juridicos.Delito;

import java.util.List;

@Repository
public interface DelitoRepository extends JpaRepository<Delito, Long> {
    List<Delito> findAllByActivo(boolean activo);
}
