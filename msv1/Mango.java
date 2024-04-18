package msv1;

public class Mango implements Fruit{
    pirvate int pricePerKg;
    @Override
    public int getPricePerKg()
    {
        return pricePerKg;
    }
    public Mango(int pricePerKg)
    {
        this.pricePerKg = pricePerKg;
    }
    public void setPricePerKg(int pricePerKg)
    {
        this.pricePerKg = pricePerKg;
    }
}
