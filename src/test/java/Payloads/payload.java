package Payloads;

import POJO.Cart;
import POJO.Product;
import POJO.Users;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;


public class payload {
    public static final Faker faker = new Faker();

    public static Product productPayload() {
        String title = faker.commerce().productName();
        Double price = Double.parseDouble(faker.commerce().price());
        String description = faker.lorem().sentence();
        String category = faker.commerce().department();
        String image = "https://unsplash.com/photos/a-brown-leather-purse-with-a-long-strap-BXWGZgFhBuU";
        return new Product(title, price, description, category, image);
    }

    public static Cart cartPayload() {
        int id = faker.number().numberBetween(1,1000);
        int userid = faker.number().numberBetween(1,100);
        List<Product> products = new ArrayList<>();
        products.add(productPayload());
        products.add(productPayload());
        return new Cart(id, userid, products);
    }

    public static Users userPayload()
    {
        int id = faker.number().numberBetween(1,1000);
        String username = faker.name().username();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password();

        return new Users(id,username,email,password);
    }

}