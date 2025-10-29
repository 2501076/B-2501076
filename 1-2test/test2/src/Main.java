import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);
        int age;
        int price;

        System.out.print("나이 입력 : ");
        age = keyboard.nextInt();

        price = age >= 18 ? 4000 : (age >= 13 ? 3000 : (age >= 7 ? 1000 : 0));

        System.out.printf("%d세의 경우, 체육관 입장료는 %,d원입니다.\n",age,price);
    }
}