/**
 * Created by juan on 6/18/15.
 *
 */
public class Customer extends User{

    private long creditCard;
    private String[] interests;
    private String postalAddress;

    public void addInterest(String interest){
        for(int i=0;i<interests.length;i++){
            if(interests[i]==null){
                interests[i]= interest;
            }
        }
    }

    private void removeInterest(String interest){
        for(int i=0;i<interests.length;i++){
            if(interests[i].equals(interest)){
                interests[i] = null;
            }
        }
    }

    public long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }
}
