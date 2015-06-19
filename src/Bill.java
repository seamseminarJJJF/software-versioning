/**
 * Created by juan on 6/18/15.
 *
 */
public class Bill {
    private long totalCost;
    private int[] discounts;

    public Bill(long totalCost) {
        this.totalCost = totalCost;
    }

    public long getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(long totalCost) {
        this.totalCost = totalCost;
    }

    public int[] getDiscounts() {
        return discounts;
    }

    public void setDiscounts(int[] discounts) {
        this.discounts = discounts;
    }

    public void calculateTotalCost() {
        for(int discount : discounts) {
            totalCost -= discount;
        }
    }
}
