import java.util.Scanner;

public class Main {
    public static int clearRightmostSetBit(int n) {
        return n & (n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int clearedNum = clearRightmostSetBit(num);

        System.out.println(clearedNum);
    }
}
