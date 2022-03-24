package RestAssured.teste;

import RestAssured.dominio.Usuario;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.core.Is.is;

public class RegistroTest {
    @BeforeClass
    public static void setup(){
        //Mostrar detalhes quando o test falhar
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        //Caminhos base para acesso a API
        baseURI = "https://reqres.in";
        basePath = "/api";
    }

    @Test
    public void testNaoEfetuaRegistroQaundoSenhaEstaFaltando() {
        Usuario usuario = new Usuario();
        usuario.setEmail("diogo@gmai.com");
        given().
                contentType(ContentType.JSON).
                body(usuario).
        post("/register").
        then().
                statusCode(HttpStatus.SC_BAD_REQUEST).
                body("error", is("Missing password"));
    }
}
