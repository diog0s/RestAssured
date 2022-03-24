package RestAssured.teste;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

public class BaseTest {
    @BeforeClass
    public static void setup(){
        //Mostrar detalhes quando o test falhar
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        //Caminhos base para acesso a API
        baseURI = "https://reqres.in";
        basePath = "/api";
    }
}
