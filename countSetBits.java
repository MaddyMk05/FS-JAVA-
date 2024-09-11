import java.util.Scanner;

public class Main {
    public static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int setBits = countSetBits(num);

        System.out.println(setBits);
    }
}
