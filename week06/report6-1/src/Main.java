import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int ticket;
        int ticketPrice;
        int totalPrice;
        int sale;
        int salePrice;

        System.out.print("식권 한 장 가격(\uFFE6) : ");
        ticketPrice = keyboard.nextInt();
        System.out.print("식권 구매 개수 입력 : ");
        ticket = keyboard.nextInt();

        totalPrice = ticketPrice * ticket;

        sale = ticket >= 30 ? 20 : (ticket >= 20 ? 15 : (ticket >= 10 ? 10 : 0));

        salePrice = (totalPrice - (totalPrice * sale / 100));

        System.out.printf("총 식권 구매액 : %,d원\n", totalPrice);
        System.out.printf("%d%% 할인 적용된 금액 : %,d원\n",sale,salePrice);
    }
}