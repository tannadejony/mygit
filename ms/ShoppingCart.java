package ms;
import java.util.Map;
import java.util.HashMap;

//购物车类，用于存储客户购买的水果及其数量，并计算总价
public class ShoppingCart {
    private Map<Fruit, Integer> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    // 添加水果到购物车
    public void addItem(Fruit fruit, int quantity) {
        items.put(fruit, items.getOrDefault(fruit, 0) + quantity);
    }

    // 计算购物车中所有水果的总价
    public int calculateTotalPrice() {
        int totalPrice = 0;
        for (Map.Entry<Fruit, Integer> entry : items.entrySet()) {
            Fruit fruit = entry.getKey();
            int quantity = entry.getValue();
            totalPrice += fruit.getPricePerKg() * quantity;
        }
        return totalPrice;
    }
}