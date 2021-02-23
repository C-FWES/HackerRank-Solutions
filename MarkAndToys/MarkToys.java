package MarkAndToys;

import java.util.Arrays;

public class MarkToys {
    static int maximumToys(int[] prices, int k) {
        int maxToys = 0;
        int c = 0;
        Arrays.sort(prices);
        for (int i = 0; i < prices.length; i++) {
            c = c+prices[i];
            if (c <= k) {
                maxToys++;
            }
            else {
                break;
            }
        }

        return maxToys;

    }

    public static void main(String[] args) {
        int k = 7;
        int[] prices = {1, 2, 3, 4};
        int maxToys = maximumToys(prices, k);
        System.out.println(maxToys);
    }

}
