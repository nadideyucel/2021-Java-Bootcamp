public class RecursiveFibonacci {
    static int fib(int n) {
            if ((n == 0) || (n == 1))
                return n;
            else
                return fib(n - 1) + fib(n - 2);
        }
    public static void main(String[] args) {
        System.out.println("0.fibonacci sayısı: " + fib(0));
        System.out.println("7.fibonacci sayısı: " + fib(7));
        System.out.println("12.fibonacci sayısı: " + fib(12));
    }
}