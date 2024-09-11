import java.util.Scanner;

public class Main {
    public static boolean isSquareFree(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % (i * i) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean isSquareFree = isSquareFree(num);

        if (isSquareFree) {
            System.out.println("SFN");
        } else {
            System.out.println("NSFN");
        }
    }
}
