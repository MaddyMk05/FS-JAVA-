mport java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] freq = new int[1000];

        for (int element : arr) {
            freq[element]++;
        }

        for (int element : arr) {
            if (freq[element] == 1) {
                System.out.print(element + " ");
            }
        }
    }
}
