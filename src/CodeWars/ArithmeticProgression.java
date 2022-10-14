package CodeWars;

import java.util.Locale;

public class ArithmeticProgression {

    //https://www.codewars.com/kata/52de553ebb55d1fca3000371/train/java
    public static int findMissing(int[] numbers) {
        // TODO: code me
        int temp = numbers[0] - numbers[1];
        int dif;

        for (int i = 2; i < numbers.length; i++) {
            dif = numbers[i - 1] - numbers[i];
            if (Math.abs(temp) > Math.abs(dif)) {
                return numbers[i - 1] + dif;
            } else if (Math.abs(temp) < Math.abs(dif)) {
                return numbers[i - 1] - temp;
            }
        }

        return numbers[0];
    }

    public static int findMissingTwo(int[] numbers) {

        int diff = (numbers[numbers.length-1] - numbers[0]) / (numbers.length);

        int miss = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            miss = numbers[i - 1] + diff;

            if (numbers[i] != miss) {

                break;
            }
        }

        System.out.println("miss: "+miss);
        
        return miss;
    }

    public static String abbrevName(String name) {
        //return name.substring(0, 1).toUpperCase() + "." + name.substring((name.indexOf(" ") + 1), (name.indexOf(" ") + 2)).toUpperCase();
        return name.toUpperCase().charAt(0) + "." + name.toUpperCase().charAt(name.indexOf(" ") + 1);
    }


    // https://www.codewars.com/kata/5aa736a455f906981800360d/train/java
    public static boolean feast(String beast, String dish) {

        if ((beast.charAt(0) == dish.charAt(0)) && (beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1))) {
            return true;
        }

        return false;

    }
}
