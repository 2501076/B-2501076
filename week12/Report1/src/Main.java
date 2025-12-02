public class Main {
    public static void main(String[] args) {

        int num1, num2;
        int result;

        num1 = Input.readData("첫번째 정수 : ");
        num2 = Input.readData("두번째 정수 : ");

        result = Compute.max(num1, num2);

        Output.display(num1, num2, result);
    }
}