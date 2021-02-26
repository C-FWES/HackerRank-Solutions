package CircularArrayRotation;

import java.util.Arrays;

public class CircularArrayRotation {
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] values = new int[queries.length];
        //rotation
        int rotateCount = k % a.length;
        for (int i = 0; i < rotateCount; i++) {
            int last = a[a.length - 1];
            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = last;
        }
        for (int i = 0; i < queries.length; i++) {
            values[i] = a[queries[i]];
        }
        return values;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int k = 2;
        int[] queries = {0, 1, 2};
        int[] values = circularArrayRotation(a, k, queries);
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
