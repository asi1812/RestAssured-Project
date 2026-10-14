package Routes;

public class routes
{

    //Base URL
    public static final String BASE_URL = "https://fakestoreapi.com/";

    //Products
    public static final String Get_all_products = "/products";
    public static final String create_new_product = "/products";
    public static final String Get_product_by_ID = "/products/{id}";
    public static final String Update_product = "/products/{id}";
    public static final String delete_product = "/products/{id}";

    //Carts
    public static final String Get_all_carts = "/carts";
    public static final String create_new_cart = "/carts";
    public static final String Get_cart_by_ID = "/carts/{id}";
    public static final String Update_cart = "/carts/{id}";
    public static final String delete_cart = "/carts/{id}";


    //Users
    public static final String Get_all_users = "/users";
    public static final String create_new_user = "/users";
    public static final String Get_user_by_ID = "/users/{id}";
    public static final String Update_user = "/users/{id}";
    public static final String delete_user = "/users/{id}";


}
