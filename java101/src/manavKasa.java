import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, e, d, m, p;
        System.out.print("Armut Kaç Kilo ? :");
        a= scan.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        e= scan.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        d= scan.nextDouble();
        System.out.print("Muz Kaç Kilo ?:");
        m= scan.nextDouble();
        System.out.print("Patlıcan Kaç Kilo :");
        p= scan.nextDouble();
        double toplamTutar = (a*2.14+e*3.67+d*1.11+m*0.95+p*5);
        System.out.print("Toplam Tutar : "+toplamTutar+ "TL");
    }
}
