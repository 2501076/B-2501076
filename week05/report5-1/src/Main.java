import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        char ch;
        char convert;
        String result;

        System.out.print("하나의 영 문자 입력 : ");
        ch = keyboard.next().charAt(0);

        convert = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : (ch >= 'a' && ch <= 'z') ? (char)(ch - 32) : ch;

        result = (ch >= 'A' && ch <= 'Z') ? String.format("입력 문자 %c는 대문자이고, 소문자로 변경하면 %c 입니다.",ch,convert)
                : ((ch >= 'a' && ch <= 'z') ? String.format("입력 문자 %c는 소문자이고, 대문자로 변경하면 %c 입니다.",ch, convert) : "영문자가 아닙니다.");

        System.out.print(result);
    }
}