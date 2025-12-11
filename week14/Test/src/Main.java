public class Main {
    public static void main(String[] args) {

        String[][][] students = new String[][][]{
                new String[][]{
                        {"2101001", "홍길동", "남"},
                        {"2101002", "박철수", "남"},
                        {"2101003", "이수민", "여"},
                        {"2101004", "김영희", "여"},
                        {"2101005", "최민호", "남"},
                        {"2101006", "정해인", "남"},
                        {"2101007", "서지우", "여"},
                        {"2101008", "오예진", "여"}
                },
                new String[][]{
                        {"2202001", "구자철", "남"},
                        {"2202002", "이가을", "여"},
                        {"2202003", "김광현", "남"},
                        {"2202004", "박종철", "남"},
                        {"2202005", "올시즌", "여"},
                        {"2202006", "남유진", "여"},
                        {"2202007", "윤민재", "남"},
                        {"2202008", "조은서", "여"},
                        {"2202009", "한도윤", "남"}
                },
                new String[][]{
                        {"2303001", "한민국", "여"},
                        {"2303002", "안우진", "남"},
                        {"2303003", "이대한", "남"},
                        {"2303004", "김지후", "남"},
                        {"2303005", "박서윤", "여"},
                        {"2303006", "정나래", "여"},
                        {"2303007", "최도현", "남"},
                        {"2303008", "윤하늘", "여"},
                        {"2303009", "강시후", "남"},
                        {"2303010", "송다은", "여"}
                }};

        int[][][] score = new int[students.length][][];
        float[][] avg = new float[students.length][];

        for (int c = 0; c < students.length; c++) {
            score[c] = Input.read(c + 1, students[c]);
            avg[c] = new float[students[c].length];
        }

        Compute.total(score);
        Compute.avg(score, avg);
        Compute.rankClass(score);
        Compute.rankAll(score);
        Compute.order(students, score, avg);

        for (int c = 0; c < students.length; c++) {
            Output.printClass(c, students[c], score[c], avg[c]);
        }

        float allAvg = Compute.avgAll(avg);
        Output.printAll(allAvg);
    }
}
