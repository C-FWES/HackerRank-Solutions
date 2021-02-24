package UtopianTree;

public class UtopianTree {
    static int utopianTree(int n) {
        int height = 1;
        if (n == 0) {
            return height;
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                height = height * 2;
            }
            else {
                height++;
            }
        }

        return height;

    }

    public static void main(String[] args) {
        int n = 4;
        int height = utopianTree(n);
        System.out.println(height);
    }
}
