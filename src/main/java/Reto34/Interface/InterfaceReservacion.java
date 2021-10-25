package Reto34.Interface;

import Reto34.Modelo.Reservacion;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceReservacion extends CrudRepository<Reservacion, Integer> {

}
