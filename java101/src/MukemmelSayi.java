import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Bir sayı giriniz: ");
        int sayi = s.nextInt();

        for(int i = 1; i < sayi; i++)
        {
            if(sayi % i == 0) {
                toplam += i;
            }
        }
        if(sayi == toplam) {
            System.out.println(sayi + " Mükemmel bir sayıdır");
        }
        else {
            System.out.println(sayi + " Mükemmel bir sayı degildir.");
        }
    }
}
