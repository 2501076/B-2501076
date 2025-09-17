//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int a=0; //선언문
        float b=0.0f;
        long c=0L;
        byte d=0;
        short f=0;
        boolean t=false;
        char g=' ';

        final  float PI=3.141592f;//Symbolic Constants 기호적 상수

        String y="";
        String z=new String(""); //두 String 같은 의미임

        a=5; //대입문   5를 정수형 리터럴
        b=5.5f; //5.5f는 float 리터럴 , 5.5는 double리터럴
        c=5;

        a=(int)6L;// 캐스트 연산자
        d=(byte) 128;
        f=(short) 40000;
        a=a+5;
    }
}