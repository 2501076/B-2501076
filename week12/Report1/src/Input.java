import java.util.Scanner;

public class Input {
    static Scanner keyboard = new Scanner(System.in);

    public static int readData(String s) {

        int temp;

        System.out.print(s);

        temp = keyboard.nextInt();
        return temp;
    }
}
