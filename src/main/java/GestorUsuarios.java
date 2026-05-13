import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class GestorUsuarios {
    private Map<String, String> usuarios = new HashMap<>();

   public void agregarUsuario(String nombre, String correo) {
        usuarios.put(nombre, correo);
    }
    
    public String getCorreo(String nombre) {
        return usuarios.get(nombre);
    }
} 


