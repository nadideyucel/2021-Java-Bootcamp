import java.util.Scanner;

public class CiftSayiTopla {
    public static void main(String[] args) {
        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
        // ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı
        Scanner scan = new Scanner(System.in);
        int total=0;
        int n;
        do {
            System.out.println("Sayi gir: ");
            n = scan.nextInt();
            if(n%2 == 0 && n%4 == 0){
                total += n;
            }
        } while (n%2==0);
        System.out.println("Toplam : "+total);

    }
}
