package POJO;

import java.util.List;

public class Cart {
    private int id;
    private int userid;
    private List<Product> product;

    public Cart(int id,int userid, List <Product> product)
    {
        this.id = id;
        this.userid = userid;
        this.product = product;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}