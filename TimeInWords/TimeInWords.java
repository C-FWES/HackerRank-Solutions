package TimeInWords;

import java.util.HashMap;

public class TimeInWords {
    static String timeInWords(int h, int m) {
        HashMap<Integer, String> numberMapping = new HashMap<>();
        numberMapping.put(1, "one");
        numberMapping.put(2, "two");
        numberMapping.put(3, "three");
        numberMapping.put(4, "four");
        numberMapping.put(5, "five");
        numberMapping.put(6, "six");
        numberMapping.put(7, "seven");
        numberMapping.put(8, "eight");
        numberMapping.put(9, "nine");
        numberMapping.put(10, "ten");
        numberMapping.put(11, "eleven");
        numberMapping.put(12, "twelve");
        numberMapping.put(13, "thirteen");
        numberMapping.put(14, "fourteen");
        numberMapping.put(15, "fifteen");
        numberMapping.put(16, "sixteen");
        numberMapping.put(17, "seventeen");
        numberMapping.put(18, "eighteen");
        numberMapping.put(19, "nineteen");
        numberMapping.put(20, "twenty");

        if (m == 0) {
            return numberMapping.get(h) + " o' clock";
        }
        if (m == 1) {
            return numberMapping.get(m) + " minute past " + numberMapping.get(h);
        }

        if (m == 15) {
            return "quarter past " + numberMapping.get(h);
        }
        if (m == 30) {
            return "half past " + numberMapping.get(h);
        }
        if (m == 45) {
            return "quarter to " + numberMapping.get(h + 1);
        }
        if (m <= 20) {
            return numberMapping.get(m) + " minutes past " + numberMapping.get(h);
        }
        if (m < 30) {
            return getText(m, numberMapping) + " minutes past " + numberMapping.get(h);
        }else {
            m = 60 - m;
            if (m <= 20) {
                return numberMapping.get(m) + " minutes to " + numberMapping.get(h+1);
            }
            else {
                return getText(m, numberMapping) + " minutes to " + numberMapping.get(h + 1);
            }
        }

    }
    public static String getText(int m, HashMap<Integer, String> numberMapping) {
        int remainder = m % 10;
        return numberMapping.get(m - remainder) + " " + numberMapping.get(remainder);
    }

    public static void main(String[] args) {
        int h = 7;
        int m = 16;
        String time = timeInWords(h, m);
        System.out.println(time);
    }


}
