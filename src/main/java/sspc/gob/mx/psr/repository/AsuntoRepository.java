package sspc.gob.mx.psr.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sspc.gob.mx.psr.model.juridicos.Asunto;

import java.util.List;

@Repository
public interface AsuntoRepository extends JpaRepository<Asunto, Long>{
    List<Asunto> findAllByActivo(boolean activo);
}
