package SDETinterview;

import java.util.Arrays;

public class Example {
/**
 * Problem Description
 *     You are given an integer N, followed by at least N lines of input (1 <= N <= 100).
 *     Each line of input contains one or several words separated with single spaces.
 *     Each word is a sequence of letters of English alphabet containing between 1 and 10 characters, inclusive.
 *     The total number of words in a line of input is between 1 and 100, inclusive.
 *
 *     Your task is to process only N lines of input and reverse the order of words in each line of input,
 *     while keeping the first and last word in their original position. The lines of your output should not have any
 *     trailing or leading spaces.
 *             Example
 *             input
 *               5
 *     Hello
 *     Hello World
 *     Hello My World
 *     Hello My Beautiful World
 *     Twinkle twinkle little star how I wonder what you are
 *
 *     output
 *     Hello
 *     Hello World
 *     Hello My World
 *     Hello Beautiful My World
 *     Twinkle you what wonder I how star little twinkle are
 */

public static void swapLines(String str, int n){
    String[] arrStr = str.split("\n");
    String[] arrWords;
    String temp;
    int len;
    for (int i = 0; i < arrStr.length; i++){
        arrWords = arrStr[i].trim().split(" ");

        if (arrWords.length > 3) {

            for (int j = 1; j < (arrWords.length)/2; j++) {

                temp = arrWords[j];

                arrWords[j] = arrWords[arrWords.length-j-1];
                arrWords[arrWords.length-j-1] = temp;

            }
        }
        System.out.println(Arrays.toString(arrWords));
    }

}



}
