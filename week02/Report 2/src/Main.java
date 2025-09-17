import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);
        int radius=0;
        double boxArea=0.0;
        double circleArea=0.0;
        double area=0.0;

        System.out.print("원의 반지름 :");
        radius=keyboard.nextInt();

        System.out.println();

        boxArea=(2*radius)*(2*radius);
        circleArea=radius*radius*Math.PI;
        area=boxArea-circleArea;

        System.out.printf("정사각형 면적 : %.0f Cm^2\n",boxArea);
        System.out.printf("원의 면적 : %.2f Cm^2\n",circleArea);
        System.out.printf("구하는 면적 : %.2f Cm^2\n",area);

    }
}