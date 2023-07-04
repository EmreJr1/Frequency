import java.util.Scanner;
import java.util.Arrays;

public class SiralamaDizi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Dizi Boyutu Giriniz : ");
        int n=inp.nextInt();

        int[] dizi = new int[n];

        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i=0 ; i<n ; i++){
            System.out.print((i+1)+". Elemanı : ");
            dizi[i]=inp.nextInt();
        }

        Arrays.sort(dizi);

        System.out.print("Sıralama : ");
        for (int eleman:dizi){
            System.out.print(eleman+" ");
        }
    }

}
