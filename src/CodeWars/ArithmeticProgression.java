package CodeWars;

import java.util.Locale;

public class ArithmeticProgression {

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

    public static String abbrevName(String name) {
        //return name.substring(0, 1).toUpperCase() + "." + name.substring((name.indexOf(" ") + 1), (name.indexOf(" ") + 2)).toUpperCase();
        return name.toUpperCase().charAt(0) + "." + name.toUpperCase().charAt(name.indexOf(" ")+1);
    }
}
