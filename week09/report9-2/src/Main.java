public class Main {
    public static void main(String[] args) {

        final int won500=500;
        final int won100=100;
        int month,amount=0;

        month=(won500 * 10 + won100 * 10);

        for(int i=1;i<=12*30;i++) {
            amount = amount + month;
        }
        System.out.printf("30년 동안의 저금액 : %,d원\n",amount);
    }
}