public class Main {
    public static void main(String[] args) {

        int year;
        boolean result;

        year = Input.resdData("년도 : ");
        result = Compute.leapYear(year);
        Output.display(year, result);
    }
}