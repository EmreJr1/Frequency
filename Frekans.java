public class Frekans {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        int[] frekanslar = new int[dizi.length];

        for (int i = 0; i < dizi.length; i++) {
            int sayi = dizi[i];
            frekanslar[i] = -1;

            int count = 1;
            for (int j = i + 1; j < dizi.length; j++) {
                if (sayi == dizi[j]) {
                    count++;
                    frekanslar[j] = 0;
                }
            }

            if (frekanslar[i] != 0) {
                frekanslar[i] = count;
            }
        }

        for (int i = 0; i < dizi.length; i++) {
            if (frekanslar[i] != 0) {
                System.out.println(dizi[i] + " sayısı " + frekanslar[i] + " kere tekrar edildi.");
            }
        }
    }
}
