import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoArray = scanner.nextInt();

        int[] array = new int[tamanhoArray];
        for (int i = 0; i < tamanhoArray; i++) {
            array[i] = scanner.nextInt();
        }

        int valorMaximo = 0;
        int indiceValorMaximo = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] > valorMaximo && indiceValorMaximo != i) {
                valorMaximo = array[i];
                indiceValorMaximo = i;
            }
        }

        System.out.println(indiceValorMaximo);

        scanner.close();
    }
}