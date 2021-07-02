import java.util.Scanner;

public class GirilenSayiyaKadarKuvvetBul {
    public static void main(String[] args) {
        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı Giriniz :");
        int sayi=scan.nextInt();
        System.out.print("4'ün kuvveti olan sayılar: ");
        for (int i=1; i<=sayi;i*=4){
            System.out.print(i+" ");
        }System.out.println("\n");
        System.out.print("5'in kuvveti olan sayılar: ");
        for (int j=1; j<=sayi ; j*=5){
            System.out.print(j+" ");
        }
    }
}