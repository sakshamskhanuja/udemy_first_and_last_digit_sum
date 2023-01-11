public class Main {
    public static void main(String[] args) {
        // Calculates the sum of first and last digit of 252.
        System.out.println(sumFirstAndLastDigit(252));

        // Calculates the sum of first and last digit of 257.
        System.out.println(sumFirstAndLastDigit(257));

        // Calculates the sum of first and last digit of 0.
        System.out.println(sumFirstAndLastDigit(0));

        // Calculates the sum of first and last digit of 5.
        System.out.println(sumFirstAndLastDigit(5));

        // Calculates the sum of first and last digit of -10.
        System.out.println(sumFirstAndLastDigit(-10));
    }

    /**
     * Calculates the sum of the first and last digit of a number.
     */
    public static int sumFirstAndLastDigit(int number) {
        // Checks for invalid value.
        if (number < 0) {
            return -1;
        }

        // Stores the last digit of the number.
        int lastDigit = number % 10;

        // Stores the first digit of the number.
        int firstDigit = 0;

        // Finds the first digit.
        while (number != 0) {
            if (number < 10) {
                firstDigit = number;
                break;
            }
            number /= 10;
        }

        // Returns the sum of first and last digit.
        return firstDigit + lastDigit;
    }
}