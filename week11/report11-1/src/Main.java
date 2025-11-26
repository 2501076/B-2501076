import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        final int fee = 1200;

        String[][] user = new String[10][2];  //번호, 이름
        int[] code = new int[10];    //구분 코드
        float[] used = new float[10];    //사용량(실수로 입력)
        int[][] bill = new int[10][4];    //반올림 사용량, 사용금액, 세금, 납부액
        int[] price = {0, 40, 55, 78, 35, 20};    //단가
        float[] rate = {0, 0.05f, 0.035f, 0.025f, 0.015f, 0f};   //세율
        String[] note = new String[10];    //비고

        int i = 0;
        while (i < 10) {

            System.out.print("번호 입력(4자리 입력): ");
            user[i][0] = keyboard.next();

            System.out.print("이름 입력: ");
            user[i][1] = keyboard.next();

            System.out.print("수도 구분코드(1~5사이 입력): ");
            code[i] = keyboard.nextInt();

            System.out.print("사용량 입력(소수점 1자리까지 입력): ");
            used[i] = keyboard.nextFloat();

            if (user[i][0].length() == 4 &&
                    code[i] >= 1 && code[i] <= 5 &&
                    used[i] >= 0) {


                bill[i][0] = Math.round(used[i]);    //반올림

                bill[i][1] = bill[i][0] * price[code[i]];

                bill[i][2] = (int)((fee + bill[i][1]) * rate[code[i]]);
                bill[i][2] = (bill[i][2] / 10) * 10;   // 1의 자리 절사

                bill[i][3] = fee + bill[i][1] + bill[i][2];

                if(code[i] == 5)
                    note[i] = "일괄징수";
                else
                    note[i] = "";

                i++;

                System.out.println();

            } else {
                System.err.println("ERROR : 번호 4자리, 코드 1~5, 사용량>=0");
                System.in.read();
            }
        }

        System.out.println("---------------------------------------------------------------------------");
        System.out.println(" 번호     이름     구분     사용량     사용금액        TAX       납부액      비고");
        System.out.println("---------------------------------------------------------------------------");

        for (i = 0; i < 10; i++) {
            String type = "";

            switch (code[i]) {
                case 1: type = "가정용"; break;
                case 2: type = "영업용"; break;
                case 3: type = "공장용"; break;
                case 4: type = "관공서"; break;
                case 5: type = "군기관"; break;
            }

            System.out.printf("%4s %7s %8s %9.1f %,12d %,9d %,10d %s\n", user[i][0], user[i][1], type, used[i], bill[i][1], bill[i][2], bill[i][3], note[i]);
        }

        System.out.println("---------------------------------------------------------------------------");
    }
}