import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        final int price = 10000;
        int age;
        int time;
        int finalPrice;

        System.out.print("나이 입력(만 나이) : ");
        age = keyboard.nextInt();
        System.out.print("관람 시간 입력(시) : ");
        time = keyboard.nextInt();

        if (time >= 6 && time <= 9) {
            finalPrice = price - price * 20 / 100;
            if (age >= 8 && age <= 18) {
                finalPrice = finalPrice - finalPrice * 30 /100;
                System.out.printf("조조할인(20%%), 청소년할인(30%%) 적용된 금액은 %,d원 입니다.\n",finalPrice);
            } else if (age >= 65) {
                finalPrice = finalPrice - finalPrice * 40 / 100;
                System.out.printf("조조할인(20%%), 경로자할인(40%%) 적용된 금액은 %,d원 입니다.\n",finalPrice);
            } else {
                System.out.printf("조조할인(20%%) 적용된 금액은 %,d원 입니다.\n",finalPrice);
            }
        } else {
            if (age >= 8 && age <= 18) {
                finalPrice = price - price * 30 /100;
                System.out.printf("청소년할인(30%%) 적용된 금액은 %,d원 입니다.\n",finalPrice);
            } else if (age >= 65) {
                finalPrice = price - price * 40 / 100;
                System.out.printf("경로자할인(40%%) 적용된 금액은 %,d원 입니다.\n",finalPrice);
            } else {
                finalPrice = price;
                System.out.printf("결제 금액은 %,d원 입니다.\n",finalPrice);
            }
        }
    }
}