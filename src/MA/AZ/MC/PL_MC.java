package MA.AZ.MC;

import java.util.Random;

public class PL_MC {
    final static int N = 6; // <- liczba przedmiotow w plecaku
    final static int MAX_V = 10; // <- objetosc plecka

    final static int[] OBJETOSCI_P = {6, 2, 3, 2, 3, 1}; // <- objetosci przedmitow
    final static int[] WARTOSCI_P = {6, 4, 5, 7, 10, 2}; // <- wartosci przedmiotow

    public static void main(String[] args) {
        Random random = new Random();
        int przedmiotyV = 0;
        int przedmiotyW = 0;
        for (int i = 0; i < 100; i++) {
            boolean[] przedmioty = new boolean[N];
            int bierzaceW = 0;
            int bierzaceV = 0;
            for (int j = 0; j < N; j++) {
                if (random.nextBoolean()) {
                    przedmioty[j] = true;
                    bierzaceW += WARTOSCI_P[j];
                    bierzaceV += OBJETOSCI_P[j];

                }

            }
            if (bierzaceW > przedmiotyW && bierzaceV < MAX_V) {
                przedmiotyW = bierzaceW;
                przedmiotyV = bierzaceV;
            }

        }
        System.out.println("Wartość przedmiotów: " + przedmiotyW);
        System.out.println("Objętość przedmiotu:" + przedmiotyV);
    }
}
