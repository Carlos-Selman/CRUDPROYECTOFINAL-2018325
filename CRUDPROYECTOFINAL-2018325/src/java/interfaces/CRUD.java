package interfaces;

import java.util.List;
import model.Persona;

public interface CRUD {
    List listar     ();
    Persona list    (int id);
    boolean add     (Persona persona);
    boolean edit    (Persona persona);
    boolean eliminar(int id);
}