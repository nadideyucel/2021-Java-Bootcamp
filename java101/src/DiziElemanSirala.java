import java.util.Scanner;

public class DiziElemanSirala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = sc.nextInt();
        int[] dizi = new int[n];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            dizi[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (dizi[j] < dizi[i]) {
                    temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }
        System.out.print("Dizinin kucukten buyuge dogru sıralanmıs hali: : ");
        for(int i : dizi){
            System.out.print(i + " ");
        }
    }
}
