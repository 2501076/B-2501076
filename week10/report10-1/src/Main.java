import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        int[] ip = new int[5];
        int nogood = 0;
        int total = 0;

        System.out.println("투표 시작 (입력이 끝나면 ctrl+d)");

        while (keyboard.hasNextInt()) {
            int xdata = keyboard.nextInt();
            total++;

            if (xdata >= 1 && xdata <= 4) {
                ip[xdata]++;
            } else {
                nogood++;
            }
        }

        System.out.println("\n  득표수  ");
        System.out.printf("1번 : %d표\n", ip[1]);
        System.out.printf("2번 : %d표\n", ip[2]);
        System.out.printf("3번 : %d표\n", ip[3]);
        System.out.printf("4번 : %d표\n", ip[4]);
        System.out.printf("무효표 : %d표\n", nogood);
        System.out.printf("  총 %d표  \n", total);
    }
}
