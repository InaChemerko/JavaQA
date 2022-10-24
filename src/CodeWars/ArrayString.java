package CodeWars;

import java.util.Arrays;
import java.util.Collections;

public class ArrayString {

    public static String highAndLow(String numbers) {
        // Code here or
        String[] arrStr= numbers.split(" ");
        Integer[] arrInt = new Integer[arrStr.length];
        for (int i = 0; i < arrStr.length; i++){
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }

        int max = Collections.max(Arrays.asList(arrInt));
        int min = Collections.min(Arrays.asList(arrInt));
        return max+" "+min;
    }

    public static boolean getXO (String str) {

        // Good Luck!!
        int x = 0;
     /*   int o = 0;
        String strIgnoreCase = str.toLowerCase();
        for (int i = 0; i< strIgnoreCase.length(); i++){
            if (strIgnoreCase.charAt(i) == ('x')){
                x++;
            }
            if (strIgnoreCase.charAt(i) == 'o'){
                o++;
            }

        }

        if (x == o){
            return true;
        }

        return false;*/
        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();

    }

}
