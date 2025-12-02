import java.util.Scanner;

public class Input {
    public static long readData(String s) {
        Scanner keyboard = new Scanner(System.in);

        long money;

        System.out.print(s);
        money = keyboard.nextLong();

        return money;
    }
}
