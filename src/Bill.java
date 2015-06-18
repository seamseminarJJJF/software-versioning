/**
 * Created by juan on 6/18/15.
 *
 */
public class Bill {
    private long totalCost;
    private int[] discounts;

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

    public long calculateTotalCost(){
        int desc = 0;
        for (int i = 0; i<discounts.length;i++){
            desc += discounts[i];
        }
        return totalCost*(desc/100);

    }
}
