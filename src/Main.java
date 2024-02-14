import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minValue = scanner.nextInt();
        int maxValue = scanner.nextInt();

        for (int i = minValue; i <= maxValue; i++) {
            String result = i % 3 == 0 && i % 5 == 0 ? "FizzBuzz" :
                            i % 3 == 0 ? "Fizz" :
                            i % 5 == 0 ? "Buzz" : String.valueOf(i);

            System.out.println(result);
        }
    }
}