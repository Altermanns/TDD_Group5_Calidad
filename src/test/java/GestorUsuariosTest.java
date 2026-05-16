import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GestorUsuariosTest {

    @Test
    void testAgregarUsuario() {
    GestorUsuarios gestor = new GestorUsuarios();
    gestor.agregarUsuario("Isaac", "isaac@example.com");
    assertEquals("isaac@example.com", gestor.getCorreo("Isaac"));
}
    //CICLO 2
    @Test
    void testEsCorreoValido() {
        GestorUsuarios gestor = new GestorUsuarios();
        
        
        assertTrue(gestor.esCorreoValido("miguel@ejemplo.com"));
        assertTrue(gestor.esCorreoValido("santiago.c@dominio.ec"));
        assertTrue(gestor.esCorreoValido("usuario_test123@sub.dominio.org"));

        
        assertFalse(gestor.esCorreoValido("correo_sin_arroba.com"));
        assertFalse(gestor.esCorreoValido("@sindominio.com"));
        assertFalse(gestor.esCorreoValido("usuario@.com"));
        assertFalse(gestor.esCorreoValido(""));
        assertFalse(gestor.esCorreoValido(null));
    } 
}
