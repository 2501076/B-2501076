import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);

        int[] score = new int[10];
        int total = 0;
        float avg = 0.0f;
        int max, min;

        System.out.println("10개의 정수 데이터 입력");

        int i = 0;
        while (i < score.length) {
            System.out.printf("%d번째 점수 입력 : ", i + 1);
            score[i] = keyboard.nextInt();

            if (score[i] >= 0 && score[i] <= 100) {
                i++;
            } else {
                System.err.println("ERROR : 0~100 입력해야함.");
                System.in.read();
            }
        }

        max = score[0];
        min = score[0];

        for (i = 0; i < score.length; i++) {
            total += score[i];

            if (score[i] > max)
                max = score[i];
            if (score[i] < min)
                min = score[i];
        }

        avg = total / 10.0f;

        System.out.printf("합계 : %d점\n", total);
        System.out.printf("평균 : %.2f점\n", avg);
        System.out.printf("최대값 : %d점\n", max);
        System.out.printf("최소값 : %d점\n", min);
    }
}
