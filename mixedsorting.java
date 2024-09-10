import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int mid = size / 2;
        for (int i = 0; i < mid; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = size - 1; i >= mid; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
