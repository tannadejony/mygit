package ms;
import ms.Fruit;
import ms.ShoppingCart;
import java.util.Scanner;
public class PrototypeMain {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int appleQuantity = readPositiveInteger(scanner, "请输入购买苹果的数量（斤）：");
            int strawberryQuantity = readPositiveInteger(scanner, "请输入购买草莓的数量（斤）：");

            ShoppingCart cart = new ShoppingCart();
            cart.addItem(new Apple(), appleQuantity);  // 购买指定数量的苹果
            cart.addItem(new Strawberry(), strawberryQuantity);  // 购买指定数量的草莓

            scanner.close();  // 关闭扫描器

            // 计算总价
            int totalPrice = cart.calculateTotalPrice();
            System.out.println("顾客A购买水果的总价为：" + totalPrice + "元");
        }

        private static int readPositiveInteger(Scanner scanner, String prompt) {
            while (true) {
                System.out.print(prompt);
                if (scanner.hasNextInt()) {
                    int value = scanner.nextInt();
                    if (value > 0) {
                        return value;
                    } else {
                        System.out.println("输入无效！请确保输入的是正整数。");
                    }
                } else {
                    System.out.println("输入无效！请确保输入的是正整数。");
                    scanner.next();  // 清除非整数输入
                }
            }
        }
    }
