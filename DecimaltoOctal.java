import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String octal = Integer.toOctalString(decimal);
        System.out.println(octal);
    }
}
