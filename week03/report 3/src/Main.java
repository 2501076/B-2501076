import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner keyboard=new Scanner(System.in);
        double cel=0.0;
        double fah=0.0;

        System.out.print("섭씨 온도 입력 (℃): ");
        cel= keyboard.nextDouble();

        fah=cel*9/5+32;

        System.out.printf("화씨 온도 (℉): %.1f",fah);


    }
}