public class Compute {

    static final String[] unit1 = {"", "일", "이", "삼", "사","오", "육","칠","팔","구"};
    static final String[] unit2 = {"", "십","백","천"};
    static final String[] unit3 = {"","만", "억","조"};

    public static String convert_4(int part) {
        String result="";
        int position=0;

        while (part>0) {
            int lastNum = part % 10;    //part의 마지막 한자리 숫자
            if(lastNum != 0) {
                result = unit1[lastNum] + unit2[position] + result;
            }
            part /= 10;
            position++;
        }
        return result;
    }

    public static String convertHangul(long money) {

        if(money == 0)
            return "영";

        String hangul = "";
        int groupIndex=0;    //unit3의 인덱스

        while(money>0) {
            int part = (int)(money % 10000);   //4자리씩 끊음

            if(part != 0) {
                hangul = convert_4(part) + unit3[groupIndex] + " " + hangul;
            }

            money /= 10000;
            groupIndex++;
        }

        return hangul;

    }
}
