public class Main {
    public static void main(String[] args) {

        final String school = "경복대학교";
        final String name = "홍길동";
        final int age=20;
        final char gender ='남';
        final double height=170.6;
        final double weight=65.4;

        System.out.println("*********************");
        System.out.printf("학교 : %s\n",school);
        System.out.printf("이름 : %s\n",name);
        System.out.printf("나이 : %d\n",age);
        System.out.printf("성별 : %c(여)\n",gender);
        System.out.printf("신장 : %.1f Cm\n",height);
        System.out.printf("체중 : %.1f Kg\n",weight);
        System.out.println("*********************");
    }
}