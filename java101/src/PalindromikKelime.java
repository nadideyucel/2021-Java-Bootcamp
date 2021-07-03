import java.util.Scanner;

public class PalindromikKelime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayac = 0;
        System.out.print("Kelime giriniz: ");
        String kelime = scan.nextLine();
        String yenikelime = "";

        for(int i = (kelime.length()-1); i >= 0; i--)
        {
            yenikelime += kelime.charAt(i);
        }
        if(yenikelime.equals(kelime)) {
            System.out.println(kelime + " kelimesi Palindrom bir kelimedir.");
        }
        else {
            System.out.println(kelime+  " kelimesi Palindrom bir kelime degildir.");
        }

    }
}
