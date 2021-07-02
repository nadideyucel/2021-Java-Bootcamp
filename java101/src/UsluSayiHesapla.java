import java.util.Scanner;

public class UsluSayiHesapla {
    public static void main(String[] args) {
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapmak
        Scanner input  = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı gir: ");
        int sayiTaban = input.nextInt();
        int b = sayiTaban;
        System.out.print("Üs olacak  sayiyi gir: ");
        int usSayi = input.nextInt();
        for(int i=1;i<usSayi;i++){
            b = sayiTaban*b;
        }
        System.out.println("Sonuc: "+b);
    }
}
