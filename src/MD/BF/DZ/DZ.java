package MD.BF.DZ;

public class DZ {
    public static void main(String[] args) {
        int[][] daneKosmonautów = {
                {1, 0, 0, 1, 0}, //A
                {0, 1, 1, 1, 0}, //B
                {0, 0, 1, 0, 1}, //C
                {1, 1, 0, 0, 1}  //D
        };

        int jakoscNajlepszegoRozwiazania = Integer.MAX_VALUE;
        String najlepszeRozwiazanie = "";

        final int N = daneKosmonautów[0].length;

        int[] kombinacja = new int[N];
        int liczbaKombinacji = (int) Math.pow(2, N);

        for (int i = 0; i < liczbaKombinacji; i++) {
            int a = 0, b = 0, c = 0, d = 0;
            int liczbaWybranychKosmonautow = 0;
            String biezaceRozwiazanie = "{ ";

            for (int j = 0; j < N; j++) {
                if (kombinacja[j] == 1) {
                    a += daneKosmonautów[0][j];
                    b += daneKosmonautów[1][j];
                    c += daneKosmonautów[2][j];
                    d += daneKosmonautów[3][j];
                    biezaceRozwiazanie += " " + (j + 1);
                    liczbaWybranychKosmonautow++;
                }
            }

            if (a > 0 && b > 0 && c > 0 && d > 0 && liczbaWybranychKosmonautow <= jakoscNajlepszegoRozwiazania) {
                System.out.println(biezaceRozwiazanie + " }");
                jakoscNajlepszegoRozwiazania = liczbaWybranychKosmonautow;
                najlepszeRozwiazanie = biezaceRozwiazanie;
            }

            int j = 0;
            while (j < N && kombinacja[j] == 1) {
                kombinacja[j] = 0;
                j++;
            }
            if (j < N) {
                kombinacja[j] = 1;
            }
        }

        System.out.println("Najlepsze rozwiazanie: " + najlepszeRozwiazanie + " }");
    }
}
