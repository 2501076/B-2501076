import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);
        String name="";
        int count=0;
        String addr="";

        System.out.print("당신의 이름은 ?");
        name=keyboard.nextLine();
        System.out.printf("%s님의 가족은 몇 명입니까 ?",name);
        count=keyboard.nextInt();
        keyboard.nextLine();
        System.out.printf("%s님의 가족은 어디에서 살지요?",name);
        addr=keyboard.nextLine();

        System.out.println();

        System.out.printf("%s님의 가족은 %d명 입니다.\n",name,count);
        System.out.printf("%s님의 가족은 %s에서 살고 있습니다.\n",name,addr);

    }
}