package msv1;

public class Strawberry implements Fruit {
    private int pricePerKg;

    public Strawberry(int pricePerKg) {
        this.pricePerKg = pricePerKg;
    }
    public void setPricePerKg(int pricePerKg) {
        this.pricePerKg = pricePerKg;
    }
    @Override
    public int getPricePerKg() {
        // 草莓价格为 13 元/斤
        return pricePerKg;
    }
}
