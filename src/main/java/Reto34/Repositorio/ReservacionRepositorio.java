package Reto34.Repositorio;

import Reto34.Interface.InterfaceReservacion;
import Reto34.Modelo.Reservacion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservacionRepositorio {

    @Autowired
    private InterfaceReservacion crud4;

    public List<Reservacion> getAll() {
        return (List<Reservacion>) crud4.findAll();
    }

    public Optional<Reservacion> getReservation(int id) {
        return crud4.findById(id);
    }

    public Reservacion save(Reservacion reservation) {
        return crud4.save(reservation);
    }

    public void delete(Reservacion reservacion) {
        crud4.delete(reservacion);
    }

}
