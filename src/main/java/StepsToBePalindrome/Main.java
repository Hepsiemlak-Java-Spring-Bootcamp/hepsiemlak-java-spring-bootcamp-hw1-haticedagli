package StepsToBePalindrome;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Integer> numberStepCounts = new HashMap<>();
        for (int i = 10; i<=100; i++){
            numberStepCounts.put(i, getNumberOfStepsToBePalindrome(Integer.toString(i)));
        }
        int maxStepNumber = numberStepCounts
                .entrySet()
                .stream()
                .max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1)
                .get().getKey();

        printStepsToBePalindrome(Integer.toString(maxStepNumber));
    }

    public static boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static String getReverse(String input){
        byte[] strAsByteArray = input.getBytes();
        byte[] result = new byte[strAsByteArray.length];
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        return new String(result);
    }

    public static int getNumberOfStepsToBePalindrome(String num){
        int count = 0;
        while (!isPalindrome(num)){
            num = plusStrings(num, getReverse(num));
            count++;
        }
        return count;
    }

    public static void printStepsToBePalindrome(String num){
        while (!isPalindrome(num)){
            String reverse = getReverse(num);
            System.out.print(num + " + " + reverse);
            num = plusStrings(num, getReverse(num));
            System.out.print(" = " + num);
            System.out.println();
        }
    }

    public static String plusStrings(String num1, String num2){
        BigInteger big1 = new BigInteger(num1);
        BigInteger big2 = new BigInteger(num2);
        return big1.add(big2).toString();
    }
}
