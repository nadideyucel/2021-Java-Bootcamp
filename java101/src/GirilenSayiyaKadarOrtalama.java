import java.util.Scanner;

public class GirilenSayiyaKadarOrtalama {
    public static void main(String[] args) {
        //0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayi Gir "); int sayi = sc.nextInt();
        int uceBolunen=0,dordeBolunen=0,ucSayac=0,dortsayac=0;
        for(int i=0;i<=sayi;i++){
            if(i%3 == 0){
                uceBolunen += i;
                ucSayac++;
            }
            if(i%4 == 0){
                dordeBolunen +=i;
                dortsayac++;
            }
        }
        int ort = (uceBolunen+dordeBolunen)/(ucSayac+dortsayac);
        System.out.println("Ortlama: "+ort);
    }
}
