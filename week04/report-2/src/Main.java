import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);
        int total;
        int price;
        float tax;

        System.out.print("판매금액(\uFFE6) : ");
        total=keyboard.nextInt();

        tax = total / 11.0f;
        price = (int)(total - tax);

        System.out.printf("금액 : %,d원\n",price);
        System.out.printf("세금 : %,.0f원\n",tax);
    }
}