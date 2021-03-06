import java.util.ArrayList;

/**
 * Created by juan on 6/18/15.
 *
 */
public class Customer extends User{

    private long creditCard;
    private ArrayList<String> interests;
    private String postalAddress;
    private ArrayList<Order> orders;

    public Customer(long creditCard) {
        this.creditCard = creditCard;
        this.interests = new ArrayList<String> ();
        this.orders = new ArrayList<Order> ();
    }

    public Customer(String postalAddress, long creditCard) {

        this.postalAddress = postalAddress;
        this.creditCard = creditCard;
        this.interests = new ArrayList<String>();
        this.orders = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void addInterest(String interest){
 	interests.add(interest);
    }

    private void removeInterest(String interest){
        for (int i=0 ; i<interests.size();i++){
		if(interests.get(i).equals(interest)){
			interests.remove(i);
		}
	}
    }

    public long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }

    public ArrayList<String> getInterests() {
        return interests;
    }

    public void setInterests(ArrayList<String> interests) {
        this.interests = interests;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }
}
