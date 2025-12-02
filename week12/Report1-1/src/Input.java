import java.util.Scanner;

public class Input {


    public static void readData(int[] num) {
        Scanner keyboard = new Scanner(System.in);

        for(int i=0; i< num.length;i++) {
            System.out.printf("%d번째 정수 입력 : ",i+1);
            num[i]=keyboard.nextInt();
        }
    }
}
