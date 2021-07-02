import java.util.Scanner;

public class RecursiveDesen {
    static void hesapla(int sayi) {
        int a = sayi;
        System.out.print(a);
        while (a > 0) {
            System.out.print("\t" + (a -= 5));
        }
        while (a <= sayi) {
            System.out.print("\t" + (a += 5));
            if (a == sayi) {
                break;
            }


        }

    }


    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        i = sc.nextInt();
        hesapla(i);
    }
}