import java.util.Scanner;

public class EtkinlikOner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Sıcaklık kaç derece ?: ");
        int  sicaklik = s.nextInt();
        if (sicaklik<5){
            System.out.println("Kayak önerilir");
        }else if(sicaklik>=5 || sicaklik<=15){
            System.out.println("Sinema önerilir");
        }else if(sicaklik>=10 || sicaklik<=25){
            System.out.println("Piknik önerilir");
        }else if(sicaklik>25){
            System.out.println("Yüzme önerilir");
        }
    }
}
