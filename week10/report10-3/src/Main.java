import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        String[] hakbun = new String[10];
        String[] name = new String[10];
        int[] mid = new int[10];
        int[] fin = new int[10];
        int[] quiz = new int[10];
        int[] report = new int[10];
        int[] attend = new int[10];
        float[] weight = new float[10];
        boolean swapped = false;
        int i = 0;

        while (i < name.length) {

            System.out.printf("\n%d번 학생 학번 입력 : ", i + 1);
            hakbun[i] = keyboard.next();

            System.out.printf("%d번 학생 이름 입력 : ", i + 1);
            name[i] = keyboard.next();

            System.out.printf("%s 학생의 중간 성적 : ", name[i]);
            mid[i] = keyboard.nextInt();

            System.out.printf("%s 학생의 기말 성적 : ", name[i]);
            fin[i] = keyboard.nextInt();

            System.out.printf("%s 학생의 퀴즈 성적 : ", name[i]);
            quiz[i] = keyboard.nextInt();

            System.out.printf("%s 학생의 과제 성적 : ", name[i]);
            report[i] = keyboard.nextInt();

            System.out.printf("%s 학생의 출석 성적 : ", name[i]);
            attend[i] = keyboard.nextInt();

            if ((mid[i] >= 0 && mid[i] <= 100) &&
                    (fin[i] >= 0 && fin[i] <= 100) &&
                    (quiz[i] >= 0 && quiz[i] <= 100) &&
                    (report[i] >= 0 && report[i] <= 100) &&
                    (attend[i] >= 0 && attend[i] <= 100)) {

                i++;
            } else {
                System.err.println("ERROR : 0~100");
                System.in.read();
            }
        }

        for (i = 0; i < name.length; i++) {
            weight[i] = mid[i] * 0.15f +
                    fin[i] * 0.15f +
                    quiz[i] * 0.10f +
                    report[i] * 0.40f +
                    attend[i] * 0.20f;
        }

        for (i = 0; i < name.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < name.length - 1 - i; j++) {

                if (weight[j] < weight[j + 1]) {

                    String text = hakbun[j];
                    hakbun[j] = hakbun[j + 1];
                    hakbun[j + 1] = text;

                    text = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = text;

                    int temp = mid[j];
                    mid[j] = mid[j + 1];
                    mid[j + 1] = temp;

                    temp = fin[j];
                    fin[j] = fin[j + 1];
                    fin[j + 1] = temp;

                    temp = quiz[j];
                    quiz[j] = quiz[j + 1];
                    quiz[j + 1] = temp;

                    temp = report[j];
                    report[j] = report[j + 1];
                    report[j + 1] = temp;

                    temp = attend[j];
                    attend[j] = attend[j + 1];
                    attend[j + 1] = temp;

                    float tmp2 = weight[j];
                    weight[j] = weight[j + 1];
                    weight[j + 1] = tmp2;

                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        System.out.println("\n*************************************************");
        System.out.println("학번    이름   중간 기말 퀴즈 과제 출석  가중치평균");
        System.out.println("*************************************************");

        for (i = 0; i < name.length; i++) {
            System.out.printf("%7s %4s %4d %4d %4d %4d %4d   %8.2f\n",
                    hakbun[i], name[i], mid[i], fin[i], quiz[i],
                    report[i], attend[i], weight[i]);
        }

        System.out.println("*************************************************");
    }
}
