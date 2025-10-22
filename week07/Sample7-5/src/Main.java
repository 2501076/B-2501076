import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int num1,num2,num3;
        int result;

        System.out.print("3개의 정수 입력 : " );
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        num3 = keyboard.nextInt();


        result = num1 >= num2 ? ((num1 >= num3) ? num1 : num2 >= num3 ? num2 : num3) : (num2 >= num3 ? num2 : (num3 >= num1 ? num3 : num1));
        System.out.printf("입력한 정수 %d, %d와 %d 중에 큰 수는 %d입니다.\n",num1,num2,num3,result);

        if (num1 >= num2) {
            if (num1 >= num3) {
                result = num1;
            } else {
                result = num3;
            }
        } else if (num2 >= num3) {
                result = num2;
            } else {
                result = num3;
            }
        System.out.printf("입력한 정수 %d, %d와 %d 중에 큰 수는 %d입니다.\n",num1,num2,num3,result);
    }
}