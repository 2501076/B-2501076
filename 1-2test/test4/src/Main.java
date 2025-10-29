import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int buy;              //매입가
        float ProfitRate;    //이익률
        float TaxRate;    //세율

        int SellPrice;   //정가
        int SellTax;     //매출세액
        int BuyTax;       //매입세액
        int TotalTax;        //납부세액

        System.out.print("매입가 입력 : ");
        buy = keyboard.nextInt();
        System.out.print("이익률, 세율 입력 (예, 30% > 0.3) : ");
        ProfitRate=keyboard.nextFloat();
        TaxRate=keyboard.nextFloat();

        SellPrice = (int)(buy * (1 + ProfitRate));
        SellTax = (int) (SellPrice * TaxRate);
        BuyTax =(int) (buy * TaxRate);
        TotalTax = SellTax - BuyTax;

        System.out.printf("*** 매입가 : %,d원, 이익률 : %.0f%%, 세율 : %.0f%% ***\n",buy,ProfitRate*100, TaxRate*100);

        System.out.printf("정가 : %,d원\n",SellPrice);
        System.out.printf("매출세액 : %,d원\n",SellTax);
        System.out.printf("매입세액 : %,d원\n",BuyTax);
        System.out.printf("*** 납부세액(매출세액 - 매입세액) : %,d원 ***\n",TotalTax);
    }
}