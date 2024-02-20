public class Main {

    // The Code Listed Below in Main will Print Hello World 8 Times
    public static void main(String[] args) {
        printHelloWorldTimes(8); // Will Print Hello World 8 times
    }

    static void printHelloWorldTimes(int n) {
        if (n > 0) {
            System.out.println("Hello World");
            printHelloWorldTimes(n - 1);
        }
    }
}
