package MA.AZ;

public class PL_AZ_najwieksze {
    final static int N = 6; // <- liczba przedmiotow w plecaku
    final static int MAX_V = 10; // <- objetosc plecka

    final static int[] OBJETOSCI_P = {6, 2, 3, 2, 3, 1}; // <- objetosci przedmitow
    final static int[] WARTOSCI_P = {6, 4, 5, 7, 10, 2}; // <- wartosci przedmiotow

    public static void main(String[] args) {

        wybierzNajwieksze();

    }

    static void wybierzNajwieksze() {
        boolean[] wybrane = new boolean[N];

        String wybranePrzedmioty = "";

        int sumaObj = 0;
        int sumaWart = 0;

        while (true) {
            int maxWartosc = 0;
            int indexPrzedmiotu = -1;
            for (int i = 0; i < N; i++) {
                if (WARTOSCI_P[i] > maxWartosc && !wybrane[i] && OBJETOSCI_P[i] + sumaObj <= MAX_V) {
                    indexPrzedmiotu = i;
                    maxWartosc += WARTOSCI_P[i];
                }
            }
            if (indexPrzedmiotu == -1) {
                break;
            } else {
                wybrane[indexPrzedmiotu] = true;
                wybranePrzedmioty += indexPrzedmiotu + ", ";
                sumaWart += WARTOSCI_P[indexPrzedmiotu];
                sumaObj += OBJETOSCI_P[indexPrzedmiotu];


            }
        }
        System.out.println("Wartość plecaka: " + sumaWart);
        System.out.println("Suma objętości plecaka: " + sumaObj);
        System.out.println("Wybrano przedmioty o numerac: " + wybranePrzedmioty);
    }
}
