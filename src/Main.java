import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[][] {
                { 1 },
                { 0 },
                { 3 }
        };

        System.out.print(array[0][0] + " " + array[0][array[0].length - 1]);
        System.out.println();
        System.out.print(array[array.length - 1][0] + " " + array[array.length - 1][array[array.length - 1].length - 1]);
    }
}