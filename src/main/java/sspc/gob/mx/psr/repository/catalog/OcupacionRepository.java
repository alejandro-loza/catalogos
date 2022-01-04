package sspc.gob.mx.psr.repository.catalog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sspc.gob.mx.psr.model.catalog.Ocupacion;

@Repository
public interface OcupacionRepository extends JpaRepository<Ocupacion, Long> {
}

