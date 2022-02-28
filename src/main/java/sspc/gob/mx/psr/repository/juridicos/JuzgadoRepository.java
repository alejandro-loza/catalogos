package sspc.gob.mx.psr.repository.juridicos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sspc.gob.mx.psr.model.juridicos.Juzgado;

import java.util.List;

@Repository
public interface JuzgadoRepository extends JpaRepository<Juzgado, Long> {
    List<Juzgado> findAllByActivoOrderByNombreAsc(boolean activo);
}
