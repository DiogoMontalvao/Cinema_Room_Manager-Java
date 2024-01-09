import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createCube()));
    }

    public static int[][][] createCube(){

        return new int[][][] {
                { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } },
                { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } },
                { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } }
        };
    }
}