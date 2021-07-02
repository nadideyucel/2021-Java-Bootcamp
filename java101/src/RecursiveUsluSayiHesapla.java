import java.util.Scanner;

public class RecursiveUsluSayiHesapla  {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int taban, üs;
        System.out.print("Üssü alınacak sayıyı giriniz :");
        taban = scan.nextInt();
        System.out.print("Üs giriniz :");
        üs = scan.nextInt();

        int sonuc = power(taban, üs);

        System.out.println("Sonuç :"+""+ sonuc);
    }

    public static int power(int taban, int üs) {

        if (üs != 0)
        {
            return (taban * power(taban, üs - 1));
        }
        else{
            return 1;
        }
    }
}
