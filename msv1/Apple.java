package msv1;

// 苹果类实现 Fruit 接口
public class Apple implements Fruit {
    private int pricePerKg;
    @Override
    public int getPricePerKg(){
        return pricePerKg;
    }

    public void setPricePerKg(int pricePerKg){
        this.pricePerKg = pricePerKg;
    }

    public Apple(int pricePerKg){
        this.pricePerKg = pricePerKg;
    }
}
