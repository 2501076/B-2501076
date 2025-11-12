import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        String[] name = {"홍길동", "이재명", "운석열", "경복대", "오세훈"};
        int[] java = new int[name.length];
        int total = 0;
        float avg = 0.0f;

        int i = 0;
        while(true) {
            System.out.printf("%s님의 JAVA성적 입력  : ",name[i]);
            java[i] = keyboard.nextInt();

            if(java[i] >= 0 && java[i] <= 100) {
                i++;
                if(i >= name.length) {
                    break;
                }
            } else {
                System.err.println("ERROR : 0~100 사이");
                System.in.read();
            }
        }

        for(i = 0; i < java.length; i++) {
            total += java[i];
        }

        avg = (float) total / java.length;

        for(i=0; i<java.length; i++) {
            System.out.printf("%s 학생 = %3d점\n",name[i],java[i]);
        }
        System.out.printf("총 점 : %3d점\n",total);
        System.out.printf("평균 : %.2f점\n",avg);
    }
}