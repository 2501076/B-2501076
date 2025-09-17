import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);
        short age=0;
        float weight=0.0f;
        float height=0.0f;

        System.out.print("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요\n");
        age=keyboard.nextShort();
        weight=keyboard.nextFloat();
        height=keyboard.nextFloat();

        System.out.println();

        System.out.printf("당신의 나이는 %d 살 입니다.\n",age);
        System.out.printf("당신의 체중은 %.1f kg 입니다.\n",weight);
        System.out.printf("당신의 신장은 %.1f cm 입니다.\n",height);
    }
}