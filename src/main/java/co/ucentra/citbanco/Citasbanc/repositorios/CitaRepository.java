package co.ucentra.citbanco.Citasbanc.repositorios;



import co.ucentra.citbanco.Citasbanc.entidades.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {
}

