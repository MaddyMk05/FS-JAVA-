import java.util.Scanner;
public class Main {
    public static String swapAdjacentWords(String input) {
        String[] words = input.split(" ");
        for (int i = 0; i < words.length - 1; i += 2) {
            String temp = words[i];
            words[i] = words[i + 1];
            words[i + 1] = temp;
        }
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = swapAdjacentWords(input);
        System.out.println(output);
    }
}
