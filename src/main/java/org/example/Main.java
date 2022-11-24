package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int intNum = 2352;
        System.out.println("Integer Number is: " + intNum);
        String strRomanNum = integerToRoman(intNum);
        System.out.println("Roman Number is: " + strRomanNum);
    }

    private static String integerToRoman(int intNum) {
        // Approach:
        // This method uses two arrays with the corresponding integer-roman map, in descending order.

        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumeral = new StringBuilder();
        for(int i = 0; i < value.length && intNum > 0; i++){
            // Check from the highest value, 1000 to the smallest.
            // If it is possible to subtract, for example 400, we know the roman numeral next is "CD".
            while(intNum >= value[i]){
                romanNumeral.append(roman[i]);
                intNum = intNum - value[i];
            }
        }
        return romanNumeral.toString();
    }
}