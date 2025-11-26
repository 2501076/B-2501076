public class Output {
    //Mathod Overload(중복 정의)


    static void display(int first, int second, int result) {
        System.out.printf("%d + %d = %d\n",first,second,result);
    }

    static void display(int first, int second) {
        System.out.printf("%d + %d = \n",first,second);
    }

    static void display() {
        System.out.println("******************************");
    }
}
