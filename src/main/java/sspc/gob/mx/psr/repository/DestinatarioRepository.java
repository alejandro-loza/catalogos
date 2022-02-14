package sspc.gob.mx.psr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sspc.gob.mx.psr.model.juridicos.Destinatario;

import java.util.List;

@Repository
public interface DestinatarioRepository extends JpaRepository<Destinatario, Long> {
    List<Destinatario> findAllByActivo(boolean activo);
}
