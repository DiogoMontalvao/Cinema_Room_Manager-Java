import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = scanner.nextInt(),
            max = scanner.nextInt(),
            n = scanner.nextInt();

        int total = 0;
        for (int i = min; i <= max; i++) {
            if (i % n == 0) total++;
        }

        System.out.println(total);
    }
}