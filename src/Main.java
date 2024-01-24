import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int larger = 0,
            smaller = 0,
            perfect = 0;

        for (int i = 0; i < size; i++) {
            int n = scanner.nextInt();

            if (n == 1) {
                larger++;
            } else if (n == -1) {
                smaller++;
            } else {
                perfect++;
            }
        }

        System.out.println(perfect + " " + larger + " " + smaller);
    }
}