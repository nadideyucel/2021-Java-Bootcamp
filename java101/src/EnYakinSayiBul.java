import java.util.Arrays;
import java.util.Scanner;

public class EnYakinSayiBul {
    public static void main(String[] args) {
        double[] dizi = { 223.4, -324.5, 150.0, 433.5, 551.5, 463.7, 59.7, -16.5 };

        double enKucuk = dizi[0];
        double enBuyuk = dizi[0];

        for (double sayi: dizi) {
            if(enKucuk > sayi)
                enKucuk = sayi;
        }

        for (double sayi: dizi) {
            if(enBuyuk < sayi)
                enBuyuk = sayi;
        }


        System.out.println("Dizi Elemanları : " + Arrays.toString(dizi));
        System.out.format("Dizideki En Küçük Sayı = %.2f \n", enKucuk);
        System.out.format("Dizideki En Büyük Sayı = %.2f \n", enBuyuk);

    }
}
