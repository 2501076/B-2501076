public class Main {
    public static void main(String[] args) {

        String school = "경복대학교";
        String name = "홍길동";
        int age=20;
        char gender ='남';
        double height=170.6;
        double weight=65.4;

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