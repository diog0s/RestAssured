package RestAssured.teste;

import RestAssured.dominio.User;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.core.Is.is;

public class RegisterTest extends BaseTest{
    private static final String REGISTER_USER_ENDPOINT = "/register";


    @Test
    public void testNaoEfetuaRegistroQaundoSenhaEstaFaltando() {
        User user = new User();
        user.setEmail("diogo@gmai.com");
        given().
                contentType(ContentType.JSON).
                body(user).
        post(REGISTER_USER_ENDPOINT).
        then().
                statusCode(HttpStatus.SC_BAD_REQUEST).
                body("error", is("Missing password"));
    }
}
