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




    //CICLO 2

    public boolean esCorreoValido(String correo) {
        if (correo == null || correo.trim().isEmpty()) {                
            return false;
        }
        return EMAIL_PATTERN.matcher(correo).matches();
            
    }

    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
    );


     //CICLO 3 





     public void CambiarCorreo(String nombre, String nuevoCorreo) {

        if(usuarios.containsKey(nombre)){


        }if (esCorreoValido(nuevoCorreo)){

            usuarios.put(nombre, nuevoCorreo);
        }else{

            System.out.println("El usuario no exite ");
        }
    }
    


}









