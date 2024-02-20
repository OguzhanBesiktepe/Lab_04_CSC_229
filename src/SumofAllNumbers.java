public class SumofAllNumbers {
    public static void main(String[] args) {
        int number1 = 35;
        int number2 = 70;
        int sum = sumMultiplesOfSeven(number1, number2);
        System.out.println("Sum of all numbers between " + number1 + " and " + number2 + ": " + sum);
    }

    static int sumMultiplesOfSeven(int number1, int number2) {
        if (number1 > number2) {
            return 0;
        } else {
            if (number1 % 7 == 0) {
                return number1 + sumMultiplesOfSeven(number1 + 7, number2);
            } else {
                return sumMultiplesOfSeven(number1 + 1, number2);
            }
        }
    }
}
