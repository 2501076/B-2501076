public class Compute {
    public static void total(int[][][] score) {

        for (int c = 0; c < score.length; c++) {

            int count = score[c].length;
            int[][] newScore = new int[count][5];

            for (int i = 0; i < count; i++) {

                for (int j = 0; j < 4; j++) {
                    newScore[i][j] = score[c][i][j];
                }
                newScore[i][4] = newScore[i][0] + newScore[i][1] +
                        newScore[i][2] + newScore[i][3];
            }

            score[c] = newScore;
        }
    }

    public static void avg(int[][][] score, float[][] avg) {

        for (int c = 0; c < score.length; c++) {
            for (int i = 0; i < score[c].length; i++) {
                avg[c][i] = score[c][i][4] / 4.0f;
            }
        }
    }

    public static void rankClass(int[][][] score) {

        for (int c = 0; c < score.length; c++) {

            int count = score[c].length;
            int[] rank = new int[count];

            for (int i = 0; i < count; i++) {
                rank[i] = 1;
                for (int j = 0; j < count; j++) {
                    if (score[c][j][4] > score[c][i][4]) {
                        rank[i]++;
                    }
                }
            }

            int[][] newScore = new int[count][6];
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < 5; j++) {
                    newScore[i][j] = score[c][i][j];
                }
                newScore[i][5] = rank[i];
            }
            score[c] = newScore;
        }
    }

    public static void rankAll(int[][][] score) {

        int total = 0;
        for (int c = 0; c < score.length; c++) {
            total += score[c].length;
        }

        int[] all = new int[total];
        int index = 0;

        for (int c = 0; c < score.length; c++) {
            for (int i = 0; i < score[c].length; i++) {
                all[index++] = score[c][i][4];
            }
        }

        int[] rankAll = new int[total];
        for (int i = 0; i < total; i++) {
            rankAll[i] = 1;
            for (int j = 0; j < total; j++) {
                if (all[j] > all[i]) {
                    rankAll[i]++;
                }
            }
        }

        index = 0;
        for (int c = 0; c < score.length; c++) {

            int count = score[c].length;
            int[][] newScore = new int[count][7];

            for (int i = 0; i < count; i++) {

                for (int j = 0; j < 6; j++) {
                    newScore[i][j] = score[c][i][j];
                }

                newScore[i][6] = rankAll[index++];
            }

            score[c] = newScore;
        }
    }
    public static void order(String[][][] students, int[][][] score, float[][] avg) {

        for (int c = 0; c < students.length; c++) {

            int count = students[c].length;

            for (int i = 0; i < count - 1; i++) {
                for (int j = i + 1; j < count; j++) {

                    String id1 = students[c][i][0];
                    String id2 = students[c][j][0];

                    if (id1.compareTo(id2) > 0) {

                        String[] tempS = students[c][i];
                        students[c][i] = students[c][j];
                        students[c][j] = tempS;

                        int[] tempSc = score[c][i];
                        score[c][i] = score[c][j];
                        score[c][j] = tempSc;

                        float tempA = avg[c][i];
                        avg[c][i] = avg[c][j];
                        avg[c][j] = tempA;
                    }
                }
            }
        }
    }

    public static float avgAll(float[][] avg) {

        float sum = 0;
        int count = 0;

        for (int c = 0; c < avg.length; c++) {
            for (int i = 0; i < avg[c].length; i++) {
                sum += avg[c][i];
                count++;
            }
        }
        return sum / count;
    }
}
