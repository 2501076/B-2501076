import java.util.Scanner;

public class Input {
    public static int resdData(String s) {
        Scanner keyboard = new Scanner(System.in);

        int year;

        System.out.print(s);
        year = keyboard.nextInt();

        return year;

    }
}
