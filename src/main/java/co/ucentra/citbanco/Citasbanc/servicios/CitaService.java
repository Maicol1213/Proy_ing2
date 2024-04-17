package co.ucentra.citbanco.Citasbanc.servicios;


import co.ucentra.citbanco.Citasbanc.entidades.Cita;
import co.ucentra.citbanco.Citasbanc.repositorios.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitaService {

    @Autowired
    private CitaRepository citaRepository;

    public void guardarCita(Cita cita) {
        citaRepository.save(cita);
    }
}

