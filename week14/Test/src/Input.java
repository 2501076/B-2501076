import java.util.Scanner;

public class Input {

    static Scanner keyboard = new Scanner(System.in);

    public static int[][] read(int classNum, String[][] oneClass) {

        int count = oneClass.length;
        int[][] score = new int[count][4];

        System.out.printf("*** %d반 성적 입력 ***\n", classNum);

        for (int i = 0; i < count; i++) {

            String name = oneClass[i][1];
            String gender = oneClass[i][2];

            score[i][0] = inputScore(classNum, name, "국어");
            score[i][1] = inputScore(classNum, name, "영어");
            score[i][2] = inputScore(classNum, name, "수학");

            if (gender.equals("남")) {
                score[i][3] = inputScore(classNum, name, "기술");
            } else {
                score[i][3] = inputScore(classNum, name, "가사");
            }
        }
        return score;
    }

    private static int inputScore(int classNum, String name, String subject) {

        while (true) {
            System.out.printf("%d반 학생 %s의 %s 점수 입력 : ", classNum, name, subject);
            int num = keyboard.nextInt();

            if (num >= 0 && num <= 100) {
                return num;
            } else {
                System.out.println("ERROR : 점수는 0에서 100 사이여야 합니다. 다시 입력하세요.");
            }
        }
    }
}
