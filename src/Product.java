/**
 * Created by juan on 6/18/15.
 *
 */
public class Product {
    private int productId;
    private String category;
    private String description;
    private long price;



    public Product(int productId, String category, String description, long price) {
        this.productId = productId;
        this.category = category;
        this.description = description;
        this.price = price;
    }
}
