/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

public class AppTest {
    @BeforeClass
    public static void setup(){
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
    @Test
    public void testDadosDoUsuario() {
        when().
                get("https://reqres.in/api/users?page=2").
        then().
                statusCode(HttpStatus.SC_OK).
                body("page", is(2)).
                body("data", is(notNullValue()));
    }
    @Test
    public void testCriarUsuario(){
        given().
                body("{\"name\": \"diogo\",\"job\": \"QA\"}").
        when().
                post("https://reqres.in/api/users").
        then().
                statusCode(HttpStatus.SC_CREATED).body("name", is("diogo"));
    }
}
