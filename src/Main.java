import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoArray = scanner.nextInt();

        int[] array = new int[tamanhoArray];
        for (int i = 0; i < tamanhoArray; i++) {
            array[i] = scanner.nextInt();
        }

        boolean ocorreProximo = false;

        int n = scanner.nextInt(), m = scanner.nextInt();
        int atual, proximo, proximoIndice = 1;

        for (int i = 0; i < tamanhoArray; i++) {
            atual = array[i];
            proximo = array[proximoIndice];

            if (proximoIndice < tamanhoArray - 1) {
                proximoIndice++;
            }

            if (atual == n && proximo == m || proximo == n && atual == m) {
                ocorreProximo = true;
            }
        }

        System.out.println(ocorreProximo);
    }
}