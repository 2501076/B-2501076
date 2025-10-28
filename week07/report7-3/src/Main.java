import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int kor,eng,math;
        float average;
        char grade;
        String result;

        System.out.print("국어, 영어, 수학 점수는?(0~100) : ");
        kor = keyboard.nextInt();
        eng = keyboard.nextInt();
        math = keyboard.nextInt();

        average = (kor + eng + math) / 3.0f;

        if (average >= 80) {
            grade = 'B';
            result = "성적 양호";
            if (average >= 90) {
                grade = 'A';
            }
        } else if (average >= 60) {
            grade = 'D';
            result = "노력";
            if (average >= 70) {
                grade = 'C';
            }
        } else {
            grade = 'E';
            result = "성적 불량";
        }
        System.out.println("====================");
        System.out.println("국어  영어  수학  평균  학점  결 과");
        System.out.printf(" %d   %d   %d  %.2f  %c  %s\n",kor,eng,math,average,grade,result);
        System.out.println("====================");
    }
}