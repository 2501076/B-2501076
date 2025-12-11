public class Output {

    public static void printClass(int classNum, String[][] students,
                                  int[][] score, float[] avg) {

        int count = students.length;

        System.out.printf("\n*** %d반 성적표 ***\n", classNum + 1);
        line();

        System.out.println("학번       이름   국어 영어 수학 선택 총점 평균  반석차 학년석차   기타");
        line();

        float sum = 0;
        for (int i = 0; i < count; i++) {
            sum += avg[i];
        }
        float classAvg = sum / count;

        for (int i = 0; i < count; i++) {

            String id = students[i][0];
            String name = students[i][1];

            int kor = score[i][0];
            int eng = score[i][1];
            int math = score[i][2];
            int sel = score[i][3];
            int total = score[i][4];
            int rankC = score[i][5];
            int rankA = score[i][6];

            System.out.printf("%s  %s  %3d  %3d  %3d  %3d  %3d  %6.2f  %3d   %4d",
                    id, name, kor, eng, math, sel, total, avg[i], rankC, rankA);

            if (avg[i] < classAvg) {
                System.out.printf("   반평균 미만");
            }
            System.out.println();
        }

        line();
        System.out.printf("%d반 전체 평균: %.2f\n", classNum + 1, classAvg);
    }

    public static void printAll(float schoolAvg) {
        System.out.printf("\n학년 전체 평균: %.2f\n", schoolAvg);
    }

    private static void line() {
        System.out.println("*****************************************************************");
    }
}
