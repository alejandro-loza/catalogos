package sspc.gob.mx.psr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sspc.gob.mx.psr.model.juridicos.Estatus;

import java.util.List;

@Repository
public interface EstatusRepository extends JpaRepository<Estatus, Long> {
    List<Estatus> findAllByActivo(boolean activo);
}
