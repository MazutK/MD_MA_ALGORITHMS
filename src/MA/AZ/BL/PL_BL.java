package MA.AZ.BL;

import java.util.Random;

public class PL_BL {
    final static int N = 6; // <- liczba przedmiotow w plecaku
    final static int MAX_V = 10; // <- objetosc plecka

    final static int[] OBJETOSCI_P = {6, 2, 3, 2, 3, 1}; // <- objetosci przedmitow
    final static int[] WARTOSCI_P = {6, 4, 5, 7, 10, 2}; // <- wartosci przedmiotow

    public static void main(String[] args) {
        Random rand = new Random();

        boolean[] rozwiazanie = new boolean[N];

        int index = 0;

        String przedmiotySpakowane = "";

        int najlepszeRozwiazanie = 0;

        int objetoscCalkowita = 0;

        for (int i = 0; i < 100; i++) {

            int obecneV = 0;
            int obecneW = 0;
            int spakowanych = 0;
            String spakowaneObecnie = " ";
            index = rand.nextInt(N);

            if (rand.nextBoolean()) {
                rozwiazanie[index] = !rozwiazanie[index];
            }
            for (int j = 0; j < N; j++) {
                if (rozwiazanie[j]) {
                    obecneW += WARTOSCI_P[j];
                    obecneV += OBJETOSCI_P[j];
                    spakowanych++;
                    spakowaneObecnie += " " + (j + 1);
                }

            }
            if (obecneW > najlepszeRozwiazanie && obecneV < MAX_V) {
                najlepszeRozwiazanie = obecneW;
                przedmiotySpakowane = spakowaneObecnie;
                objetoscCalkowita = obecneV;

            }
        }
        System.out.println("Całkowita wartość plecaka: " + najlepszeRozwiazanie);
        System.out.println("Wybrane przedmioty: " + przedmiotySpakowane);
        System.out.println("Wykorzystano objętości: " + objetoscCalkowita + "/10");

    }
}
