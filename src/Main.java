import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int armyNumber = scanner.nextInt();

        if (armyNumber < 1) {
            System.out.println("no army");
        } else if (armyNumber >= 1 && armyNumber <= 19) {
            System.out.println("pack");
        } else if (armyNumber >= 20 && armyNumber <= 249) {
            System.out.println("throng");
        } else if (armyNumber >= 250 && armyNumber <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}