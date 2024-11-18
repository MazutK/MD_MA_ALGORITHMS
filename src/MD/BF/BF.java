package MD.BF;

public class BF {
    private final static int N = 6;
    private static int[] permutacja = new int[N];
    static int[][] czas = {{0, 7, 20, 21, 12, 23},
            {27, 0, 13, 16, 46, 5},
            {53, 15, 0, 25, 27, 6},
            {16, 2, 35, 0, 47, 10},
            {31, 29, 5, 18, 0, 4},
            {28, 24, 1, 17, 5, 0}};
    static int minCzas = Integer.MAX_VALUE;
    static String najlepszaKolejnosc = "";
    static void permutacje(int i){
        if(i == N){
            String aktualnakolejosc = "";
            int aktCzas = 0;

            for (int j = 0; j < N; j++) {
                aktualnakolejosc += (permutacja[j] + 1) + ", ";
                if(j < N - 1){
                    aktCzas += czas[permutacja[j]][permutacja[j+1]];
                }
            }
            aktCzas += czas[permutacja[N-1]][permutacja[0]];
            aktualnakolejosc += (permutacja[0] + 1);
            System.out.println("LODY: " + aktualnakolejosc + " CZAS: " + aktCzas);
            if(aktCzas < minCzas){
                minCzas = aktCzas;
                najlepszaKolejnosc = aktualnakolejosc;
            }
        } else {
            for (int j = 0; j < N; j++) {
                int k;
                for (k = 0; k < i; k++) {
                    if(permutacja[k] == j){
                        break;
                    }
                }
                if (k == i) {
                    permutacja[i] = j;
                    permutacje(i + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        permutacje(0);
        System.out.println(">> BEST:\n\tCzas: " + minCzas + "\tsekwencja: " + najlepszaKolejnosc);
    }


}
