import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        String strNum = String.valueOf(num);
        String reversedStrNum = new StringBuilder(strNum).reverse().toString();

        if (strNum.equals(reversedStrNum)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
