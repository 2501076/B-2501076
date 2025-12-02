public class Main {
    public static void main(String[] args) {

        long money;
        String result;

        money = Input.readData("금액 입력 : ");
        result = Compute.convertHangul(money);
        Output.display(money, result);
    }
}