public class Main {
    public static void main(String[] args) {

        int depth=300;
        int climb=55;
        int slip=13;
        int day=0,height=0;

        while(height<depth) {
            day++;
            height=height+climb;
            if(height>=depth) {
                break;
            }
            height=height-slip;
        }
        System.out.printf("달팽이는 %d일 만에 우물을 탈출했습니다.\n",day);
    }
}