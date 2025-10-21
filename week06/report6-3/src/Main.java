import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int age;
        char card;
        int time;
        int price;

        System.out.print("교통카드 사용 여부 (y/n) : ");
        card = keyboard.next().charAt(0);
        System.out.print("만 나이 입력 : ");
        age = keyboard.nextInt();
        System.out.print("탑승한 시간 입력(시) : ");
        time = keyboard.nextInt();

        if (card == 'y' || card == 'Y') {
            price = age >= 19 ? 1250 : (age >= 13 ? 750 : (age >= 6 ? 450 : 0));
        }
        else {
            price = age >= 19 ? 1350 :(age >= 13 ? 850 : (age >= 6 ? 450 : 0));
        }

        if (time >= 22 || time <= 5) {
            price = price + price * 20 / 100;
        }

        System.out.print("\n(탑승 시간이 22~05시에 해당하면 20%의 심야 추가요금 발생)\n");
        System.out.printf("%d시에 탑승한 %02d세 탑승자의 요금은 %,d원입니다.\n",time,age,price);
    }
}