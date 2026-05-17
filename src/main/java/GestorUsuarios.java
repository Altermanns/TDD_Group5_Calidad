import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class GestorUsuarios {
    private Map<String, String> usuarios = new HashMap<>();

    //CICLO 1
    public void agregarUsuario(String nombre, String correo) {
        usuarios.put(nombre, correo);
    }

    public String getCorreo(String nombre) {
        return usuarios.get(nombre);
    }

    //CICLO 2
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
    );

    public boolean esCorreoValido(String correo) {
        if (correo == null || correo.trim().isEmpty()) {
            return false;
        }
        return EMAIL_PATTERN.matcher(correo).matches();
    }

    //CICLO 3
    public void actualizarCorreo(String nombre, String nuevoCorreo) {
        if (usuarios.containsKey(nombre) && esCorreoValido(nuevoCorreo)) {
            usuarios.put(nombre, nuevoCorreo);
        }
    }

    //CICLO 4
    public void eliminarUsuario(String nombre) {
        usuarios.remove(nombre);
    }

    //CICLO 5: 
    public void agregarUsuarioSeguro(String nombre, String correo) {
        if (esCorreoValido(correo) && !usuarios.containsValue(correo)) {
            usuarios.put(nombre, correo);
        }
    }
}
