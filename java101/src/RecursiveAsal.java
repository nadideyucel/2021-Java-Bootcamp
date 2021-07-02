import java.util.Scanner;

public class RecursiveAsal {
    static boolean asalMi(int n, int i) {

        // Base cases
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        // Check for next divisor
        return asalMi(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int n = scan.nextInt();
        if (asalMi(n, 2))
            System.out.print(n + " " + "sayısı ASALDIR !");
        else
            System.out.print(n + " " + "sayısı ASAL değildir !");
    }
}