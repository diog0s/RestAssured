package RestAssured.teste;

import RestAssured.dominio.Usuario;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.core.Is.is;

public class RegistroTest extends BaseTest{
    private static final String REGISTRA_USUARIO_ENDPOINT = "/register";


    @Test
    public void testNaoEfetuaRegistroQaundoSenhaEstaFaltando() {
        Usuario usuario = new Usuario();
        usuario.setEmail("diogo@gmai.com");
        given().
                contentType(ContentType.JSON).
                body(usuario).
        post(REGISTRA_USUARIO_ENDPOINT).
        then().
                statusCode(HttpStatus.SC_BAD_REQUEST).
                body("error", is("Missing password"));
    }
}
