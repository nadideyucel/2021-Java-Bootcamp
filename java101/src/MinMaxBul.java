import java.util.Scanner;

public class MinMaxBul {
    public static void main(String[] args) {
        //Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan program
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz");
        int adim = scan.nextInt();
        int maks=0,min=0;

        for (int i=1; i<=adim; i++)
        {
            System.out.println(i+". sayiyi giriniz: ");
            int sayi = scan.nextInt();

            if (i==1)
            {
                maks=sayi;
                min=sayi;
            }

            if (sayi>maks)
                maks=sayi;

            if (sayi<min)
                min=sayi;
        }

        System.out.println("En büyük sayı: "+maks);
        System.out.println("En küçük sayı : "+min);
    }
}
