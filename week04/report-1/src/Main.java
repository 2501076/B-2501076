import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        final int UNIT_PRICE = 56000;
        double pyeong;
        int price;

        System.out.print("평 수 입력 : ");
        pyeong = keyboard.nextDouble();

        price = (int)(UNIT_PRICE * pyeong);

        price /= 1000;
        price *= 1000;

        System.out.printf("신도시 주택지 가격(\uFFE6) : %,d\n",price);
    }
}