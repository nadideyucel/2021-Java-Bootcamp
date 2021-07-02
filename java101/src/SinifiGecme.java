import java.util.Scanner;

public class SinifiGecme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float matOrtalama = 0,turkceOrtalama=0,fizikOrtalama=0,kimyaOrtalama=0;
        int adet;
        System.out.println("Matematik notlarını giriniz: ");
        System.out.print("1.not");  int n1 = sc.nextInt();
        System.out.print("2.not");  int n2 = sc.nextInt();

        if(n1>0 && n1<100 && n2>0 && n2<100 ){
            matOrtalama = (n1+n2)/2;
        }

        System.out.println("Fizik notlarını giriniz: ");
        System.out.print("1.not");  int f1 = sc.nextInt();
        System.out.print("2.not");  int f2 = sc.nextInt();

        if(f1>0 && f1<100 && f2>0 && f2<100){
            fizikOrtalama = (f1+f2)/2;
        }

        System.out.println("Türkçe notlarını giriniz: ");
        System.out.print("1.not");  int t1 = sc.nextInt();
        System.out.print("2.not");  int t2 = sc.nextInt();

        if(t1>0 && t1<100 && t2>0 && t2<100){
            turkceOrtalama = (t1+t2)/2;
        }

        System.out.println("Kimya notlarını giriniz: ");
        System.out.print("1.not");  int k1 = sc.nextInt();
        System.out.print("2.not");  int k2 = sc.nextInt();

        if(k1>0 && k1<100 && k2>0 && k2<100){
            kimyaOrtalama = (k1+k2)/2;
        }
        float genelOrtalama = (fizikOrtalama+kimyaOrtalama+matOrtalama+turkceOrtalama)/4;
        if (genelOrtalama>55) {
            System.out.println("Sınıfı geçtiniz!! ortalamanız: "+genelOrtalama);
        }else{
            System.out.println("Sınıfı geçemediniz!! ortalamanız: "+genelOrtalama);
        }
    }
    }

