package msv1;

public class FixedDiscount implements Discount{
    private int amount;
    public FixedDiscount(int amount)
    {
        this.amount = amount;
    }
    @Override
    public int calculateDiscountAmount(ShoppingCart cart)
    {
        return amount;
    }
}
