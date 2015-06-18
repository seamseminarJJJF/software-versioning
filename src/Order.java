import java.util.ArrayList;
import java.util.Date;

/**
 * Created by juan on 6/18/15.
 *
 */
public class Order {

    private int orderId;
    private Date creationDate;
    private String dateShipped;
    private String status;
    private Bill bill;
    public ArrayList<Product> products;

    public Bill getBill() {
        return bill;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getDateShipped() {
        return dateShipped;
    }

    public void setDateShipped(String dateShipped) {
        this.dateShipped = dateShipped;
    }

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
