package Day2;

import java.util.Arrays;

public class Chapter2 {
    public static void main(String[] main) {
        int[][] tab = {{10, 7}, {4, 88, 6}, {10, 15, 78, 45}};
        for (int[] tab1 : tab) {
            for (int tab2 : tab1) {
                System.out.print(tab2 + "\t");
            }
            System.out.println();
        }
    }
}
