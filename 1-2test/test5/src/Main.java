import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);
        int r;
        double vol;
        double sur;
        final double PI = 3.141592;

        System.out.print("구의 반지름 입력 : ");
        r = keyboard.nextInt();

        vol = (4.0 / 3.0) *PI * r * r * r;
        sur = 4 * PI *r *r;

        System.out.printf("반지름이 %d인 구의 부피는 %.2f \u33A4 표면적은 %.2f\u33A0 입니다.\n",r,vol,sur);
    }
}