import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int literPrice;
        int liter;
        int price;
        int totalPrice;

        System.out.print("리터 당 가격(\uFFE6) : ");
        literPrice = keyboard.nextInt();
        System.out.print("주유 할 리터 수 : ");
        liter = keyboard.nextInt();

        price = literPrice * liter;

        if(price >= 50000) {
            price = price - price * 7 / 100;
        }
        totalPrice = price + (int) (price * 0.1);

        if(literPrice * liter >= 50000) {
            System.out.printf("%d리터 주유한 가격(7%% 할인 적용, 부가세 포함) : %,d원\n",liter,totalPrice);
        }
        else {
            System.out.printf("%d리터 주유한 가격(부가세 포함) : %,d원\n",liter,totalPrice);
        }
    }
}