import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        float time;
        int totalsec;
        int day, hour,min,sec;

        System.out.print("시간 입력 : ");
        time = keyboard.nextFloat();

        totalsec = (int)(time * 3600);

        day = totalsec / (24 * 3600);
        totalsec %= (24 * 3600);

        hour = totalsec / 3600;
        totalsec %= 3600;

        min = totalsec / 60;

        sec = totalsec % 60;

        System.out.printf("%.2f 시간은 %d 일 %d 시간 %d 분 %d 초 입니다\n",time,day,hour,min,sec);
    }
}