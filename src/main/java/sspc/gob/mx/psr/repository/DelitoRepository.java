package sspc.gob.mx.psr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sspc.gob.mx.psr.model.juridicos.Delito;

@Repository
public interface DelitoRepository extends JpaRepository<Delito, Long> {
}
