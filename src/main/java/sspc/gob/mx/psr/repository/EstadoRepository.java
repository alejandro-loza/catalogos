package sspc.gob.mx.psr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sspc.gob.mx.psr.model.Estado;

import java.util.List;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
}

