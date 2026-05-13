import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestorUsuariosTest {

 @Test
public void testAgregarUsuario() {
    GestorUsuarios gestor = new GestorUsuarios();
    gestor.agregarUsuario("Isaac", "isaac@example.com");
    assertEquals("isaac@example.com", gestor.getCorreo("Isaac"));
}
    
}
