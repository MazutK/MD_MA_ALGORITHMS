package MA.AZ;

public class PL_AZ_najciezsze {
    final static int N = 6; // <- liczba przedmiotow w plecaku
    final static int MAX_V = 10; // <- objetosc plecka

    final static int[] OBJETOSCI_P = {6, 2, 3, 2, 3, 1}; // <- objetosci przedmitow
    final static int[] WARTOSCI_P = {6, 4, 5, 7, 10, 2}; // <- wartosci przedmiotow

    public static void main(String[] args) {
        wybierzNajciezsze();

    }

    public static void wybierzNajciezsze() {
        boolean[] wybrane = new boolean[N];
        int wartoscNajlepszegoRozwiazania = 0;
        int objetoscNajlepszegoRozwiazania = 0;
        int wybranychPrzedmiotow = 0;
        String rozwiazanie = " ";
        while (true) {
            int obecnaWartosc = 0;
            int obecnaObjetosc = 0;
            int indexPrzedmiotu = -1;
            for (int i = 0; i < OBJETOSCI_P.length; i++) {
                if (OBJETOSCI_P[i] > obecnaObjetosc && !wybrane[i] && OBJETOSCI_P[i] + objetoscNajlepszegoRozwiazania <= MAX_V) {
                    indexPrzedmiotu = i;
                    obecnaObjetosc += OBJETOSCI_P[i];
                    wybranychPrzedmiotow++;
                }

            }
            if (indexPrzedmiotu == -1) {
                break;
            } else if (obecnaObjetosc < MAX_V) {
                wybrane[indexPrzedmiotu] = true;
                wartoscNajlepszegoRozwiazania += WARTOSCI_P[indexPrzedmiotu];
                objetoscNajlepszegoRozwiazania += OBJETOSCI_P[indexPrzedmiotu];
            }
        }
        System.out.println("Wartosc najlepszego rozwiazania: " + wartoscNajlepszegoRozwiazania);
        System.out.println("OBJ najlepszego rozwiazania: " + objetoscNajlepszegoRozwiazania);
        System.out.println("Wybranych przedmiotów: " + wybranychPrzedmiotow);

    }
}
