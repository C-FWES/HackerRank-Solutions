package IceCreamParlor;

import java.util.Arrays;

public class IceCreamParlor {
    static int[] icecreamParlor(int m, int[] arr) {
        int[] indexOfFlavors = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == m) {
                    indexOfFlavors[0] = i+1;
                    indexOfFlavors[1] = j+1;
                    return indexOfFlavors;
                }
            }
        }
        return indexOfFlavors;
    }

    public static void main(String[] args) {
        int m = 4;
        int[] flavors = {2, 2, 4, 3};
        int[] output = icecreamParlor(m, flavors);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " " );
        }
    }

}
