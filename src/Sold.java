import java.util.Scanner;

public class Sold {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

        int smallTicketPrice;
        int frontTicketPrice;
        int backTicketPrice;
        int totalIncome;

        if (rows * seats <= 60) {
            smallTicketPrice = 10;
            totalIncome = rows * seats * smallTicketPrice;
        } else if (rows % 2 == 0) {
            frontTicketPrice = 10;
            backTicketPrice = 8;
            totalIncome = ((rows / 2) * seats * frontTicketPrice) + ((rows / 2) * seats * backTicketPrice);
        } else {
            frontTicketPrice = 10;
            backTicketPrice = 8;
            totalIncome = ((rows / 2) * seats * frontTicketPrice) + (((rows / 2) + 1) * seats * backTicketPrice);
        }

        System.out.println("Total income:");
        System.out.println("$" + totalIncome);
    }
}
