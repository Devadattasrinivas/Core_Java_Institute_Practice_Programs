package codegnan;
class Fibonacci {
    public static int fibo(int number) {
        if (number <= 1)
            return number;
        return fibo(number - 1) + fibo(number - 2);
    }
    public static void printFibonacci(int number) {
        for (int i = 0; i < 10; i++) {
            fibo(number);
        }
        System.out.println(fibo(number));
    }
}
public class FibonacciWithRecursion {
    public static void main(String[] args) {
        Fibonacci.printFibonacci(10);
    }
}
