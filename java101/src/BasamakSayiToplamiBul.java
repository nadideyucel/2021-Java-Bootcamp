import java.util.Scanner;

public class BasamakSayiToplamiBul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak toplamı alınacak sayıyı girin: ");
        int num = input.nextInt();

        int adet = 0,toplam=0;

        while(num != 0)
        {
            toplam=(num%10)+toplam;
            num /= 10;
            ++adet;
        }

        System.out.println("Basamak Toplamı: " + toplam);
    }
}
