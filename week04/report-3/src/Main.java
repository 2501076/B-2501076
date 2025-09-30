import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);
        int dollar, half, quarter,dime,nickel,penny;
        int totalDollar, totalCents, cents;

        System.out.print("달러 개수 입력(\u00A2) : ");
        dollar=keyboard.nextInt();
        System.out.print("하프 개수 입력(\u00A2) : ");
        half=keyboard.nextInt();
        System.out.print("쿼터 개수 입력(\u00A2) : ");
        quarter=keyboard.nextInt();
        System.out.print("다임 개수 입력(\u00A2) : ");
        dime=keyboard.nextInt();
        System.out.print("니켈 개수 입력(\u00A2) : ");
        nickel=keyboard.nextInt();
        System.out.print("페니 개수 입력(\u00A2) : ");
        penny=keyboard.nextInt();

        totalCents = (dollar * 100) + (half * 50) + (quarter * 25) + (dime * 10) + (nickel * 5) + penny;
        totalDollar = totalCents / 100;
        cents = totalCents % 100;

        System.out.printf("총 금액 : %d달러 %d센트\n",totalDollar,cents);
    }
}