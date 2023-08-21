package clase_1;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToIntegerConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor a convertir");
        String letraRomanos = scanner.nextLine();
        String romanNumber= letraRomanos.toUpperCase();
        int integerNumber = romanToInt(romanNumber);
        System.out.println("Roman: " + romanNumber + " Integer: " + integerNumber);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(s.charAt(i));
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        return result;
    }
}