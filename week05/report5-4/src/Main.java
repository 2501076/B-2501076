import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int amount;
        char membership;
        boolean freeshipping;

        System.out.print("구매 금액 입력 : ");
        amount = keyboard.nextInt();

        System.out.print("멤버십 여부 입력(보유:y / 미보유:n) : ");
        membership = keyboard.next().charAt(0);

        freeshipping = (amount >= 50000) || ((membership == 'y' || membership == 'Y') && amount >= 30000);

        System.out.print(freeshipping ? "무료 배송 가능" : "무료 배송 불가");

    }
}