import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int altura1 = scanner.nextInt();
        int altura2 = scanner.nextInt();
        int altura3 = scanner.nextInt();

        boolean ordemDecrescente = altura1 >= altura2 && altura2 >= altura3;
        boolean ordemCrescente = altura1 <= altura2 && altura2 <= altura3;

        System.out.println(ordemDecrescente || ordemCrescente);
    }
}