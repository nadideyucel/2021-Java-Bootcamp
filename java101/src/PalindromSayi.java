import java.util.Scanner;

public class PalindromSayi {
    public static void palindromBul(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi Giriniz : ");
        int palindrom = scan.nextInt();
        int ilkdeger = palindrom;
        int length = String.valueOf(palindrom).length();

        int kalan,deger=0;
        for (int i = 0; i<length; i++){

            kalan = palindrom % 10;
            deger = deger * 10 + kalan;
            palindrom = palindrom /10;
        }

        if(deger == ilkdeger){
            System.out.println(deger + " Palindrom Sayidir.");
        }else{
            System.out.println(ilkdeger + " Palindrom Sayi Degildir.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        palindromBul();
    }
}
