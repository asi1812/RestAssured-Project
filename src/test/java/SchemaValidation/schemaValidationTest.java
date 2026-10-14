package SchemaValidation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class schemaValidationTest {
    @Test
    public void validationOfSchema(){
        given()
                .when().get("https://jsonplaceholder.org/posts/1")
                .then().statusCode(200).
                body(matchesJsonSchemaInClasspath("postSchema.json"))
                .log().all();
    }
}
