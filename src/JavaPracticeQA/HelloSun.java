package JavaPracticeQA;

public class HelloSun {
    public static void countNum(String str){
        char[] arr = str.toCharArray();
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
