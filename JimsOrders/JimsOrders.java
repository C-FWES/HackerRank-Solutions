package JimsOrders;

import java.util.*;

public class JimsOrders {
    static int[] jimOrders(int[][] orders) {
        int[] sortedOrders = new int[orders.length];
        HashMap<Integer, Integer> orderAndServeTime = new HashMap<>();
        int customerNumber = 1;
        for (int[] order : orders) {
            orderAndServeTime.put(customerNumber++, order[0] + order[1]);
        }

        Set<Map.Entry<Integer, Integer>> ordersSet = orderAndServeTime.entrySet();
        List<Map.Entry<Integer, Integer>> ordersList = new ArrayList<>(ordersSet);



//        Comparator<Map.Entry<Integer, Integer>> comp = new Compaarator<Map.Entry<Integer, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
//                return entry1.getValue().compareTo(entry2.getValue());
//            }
//        };
//        Collections.sort(sortOrders, comp);
        Collections.sort(ordersList, Comparator.comparing(Map.Entry::getValue));

        sortedOrders = ordersList.stream().mapToInt(Map.Entry::getKey).toArray();
//        int i = 0;
//        for (Map.Entry<Integer, Integer> entry : sortOrders) {
//            sortedOrders[i] = entry.getKey();
//            i++;
//        }
        return sortedOrders;
    }

    public static void main(String[] args) {
        int[][] orders = new int[3][];
        orders[0] = new int[]{1, 1};
        orders[1] = new int[]{2, 5};
        orders[2] = new int[]{3, 3};
        int[] result = jimOrders(orders);
        for (int i = 0; i < orders.length; i++) {
            System.out.println(result[i]);
        }

    }

}
