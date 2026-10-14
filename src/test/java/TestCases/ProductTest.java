package TestCases;

import POJO.Product;
import Payloads.payload;
import Routes.routes;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class ProductTest extends Baseclass {
    @Test
    public void getAllProductTest()
    {
        given()
                .when().get(routes.Get_all_products)
                .then().statusCode(200).body("size()",
                        greaterThan(0)).log().all();
    }

    @Test
    public void getAllProductByIdTest()
    {
        int productId = configReader.getIntProperty("productid");
        given().pathParams("id", productId)
                .when().get(routes.Get_product_by_ID)
                .then().statusCode(200).body("size()",
                        greaterThan(0)).log().all();

    }

    @Test
    public void createProductTest() {
        Product newProduct = payload.productPayload();
        int product_id = given().contentType("application/json").body(newProduct)
                .when().post(routes.create_new_product)
                .then().statusCode(201).extract().jsonPath().getInt("id");
        System.out.println("Created product with ID: " + product_id);

    }

    @Test
    public void updateProductTest() {
        int productid = configReader.getIntProperty("productid");
        Product updatedPayload = payload.productPayload();

        given().pathParams("id", productid)
                .contentType("application/json")
                .body(updatedPayload)

         .when().put(routes.Update_product)

          .then().statusCode(200).body("title", equalTo(updatedPayload.getTitle()));

        System.out.println("Updated product with ID: " + productid);


    }



}