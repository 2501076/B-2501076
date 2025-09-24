import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);
        int fir=0;
        int sec=0;
        int result=0;


        System.out.print("첫번째 숫자를 입력하세요 ");
        fir= keyboard.nextInt();
        System.out.print("두번째 숫자를 입력하세요 ");
        sec= keyboard.nextInt();

        result=fir+sec;

        System.out.printf("%d + %d = %d",fir,sec,result);
    }
}