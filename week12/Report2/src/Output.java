public class Output {

    public static void display(int year, boolean result) {
        if(result)
            System.out.printf("%d는 윤년입니다.\n",year);
        else
            System.out.printf("%d는 윤년이 아닙니다.\n", year);
    }
}
