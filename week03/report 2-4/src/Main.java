import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);
        String school="";
        String name="";
        int age=0;
        char gender=' ';
        double height=0.0;
        double weight=0.0;

        school= keyboard.nextLine();
        name=keyboard.nextLine();
        age= keyboard.nextInt();
        keyboard.nextLine(); //비우기
        gender=keyboard.next().charAt(0);
        height=keyboard.nextDouble();
        weight=keyboard.nextDouble();


        System.out.println("*********************");
        System.out.printf("학교 : %s\n",school);
        System.out.printf("이름 : %s\n",name);
        System.out.printf("나이 : %d\n",age);
        System.out.printf("성별 : %c (여)\n",gender);
        System.out.printf("신장 : %.1f Cm\n",height);
        System.out.printf("체중 : %.1f Kg\n",weight);
        System.out.println("*********************");

    }
}