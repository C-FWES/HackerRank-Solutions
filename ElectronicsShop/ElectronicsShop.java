package ElectronicsShop;

import java.util.Arrays;


public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int price = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if (keyboards[i] + drives[j] > price && keyboards[i] + drives[j] <= b) {
                    price = keyboards[i] + drives[j];
                }

            }
        }
        return price;

    }


    public static void main(String[] args) {
        int b = 1;
        int[] keyboards = {3, 1};
        int[] drives = {5, 2, 8};
        int moneySpended = getMoneySpent(keyboards, drives, b);
        System.out.println(moneySpended);

    }
}
