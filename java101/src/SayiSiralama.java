import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        //Girilen sayıları büyükten küçüğe sıralayan program
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.println("1. Sayıyı giriniz: ");
        a = input.nextInt();

        System.out.println("2. Sayıyı giriniz: ");
        b = input.nextInt();

        System.out.println("3. Sayıyı giriniz: ");
        c = input.nextInt();


        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("Büyükten küçüğe : 1.sayı > 2.sayı >3.sayı ");

            } else {
                System.out.println("Büyükten küçüğe: 1.sayı >3.sayı >2.sayı ");
            }

        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("Büyükten küçüğe 2.sayı >1.sayı > 3.sayı");


            } else {
                System.out.println("Büyükten küçüğe 2.sayı >3.sayı >1.sayı ");
            }
        } else if ((c > a) && (c > b)) {
            if (a > b) {
                System.out.println("Büyükten küçüğe 3.sayı >1.sayı >2.sayı ");
            } else {
                System.out.println("Büyükten küçüğe 3.sayı >2.sayı >1.sayı ");
            }
        }



    }
}
