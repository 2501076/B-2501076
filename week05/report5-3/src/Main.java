import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int time;
        int hour, minute, second;

        System.out.print("시간 입력(초) : ");
        time = keyboard.nextInt();

        hour = time / 3600;

        minute = (time % 3600) / 60;

        second = (time % 3600) % 60;

        System.out.printf("%d시간 %02d분 %02d초\n",hour,minute,second);
    }
}