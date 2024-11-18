package MA.AZ;

public class PL_AZ {
    final static int N = 6; // <- liczba przedmiotow w plecaku
    final static int MAX_V = 10; // <- objetosc plecka

    final static int[] OBJETOSCI_P = {6, 2, 3, 2, 3, 1}; // <- objetosci przedmitow
    final static int[] WARTOSCI_P = {6, 4, 5, 7, 10, 2}; // <- wartosci przedmiotow

    public static void main(String[] args) {

        wybierzCenne();

    }


    public static void wybierzCenne() {

        boolean[] spakowane = new boolean[N];


            String przedmioty = "Wybrane przedmioty: ";
            int sumaOjb = 0;
            int sumaV = 0;
        while (true) {

            int maxWartosc = 0;
            int indexPrzedmiotu = -1;

            for (int i = 0; i < N; i++) {
                if (WARTOSCI_P[i] > maxWartosc && !spakowane[i] && sumaOjb + OBJETOSCI_P[i] <= MAX_V) {
                    maxWartosc = WARTOSCI_P[i];
                    indexPrzedmiotu = i;
                }

            }
            if(indexPrzedmiotu == -1){
                break;
            }else{
                spakowane[indexPrzedmiotu] = true;
                sumaOjb += OBJETOSCI_P[indexPrzedmiotu];
                sumaV += WARTOSCI_P[indexPrzedmiotu];
                przedmioty += indexPrzedmiotu+", ";
            }

        }
        System.out.println("Wartość plecaka: "+sumaV);
        System.out.println("Wykorzystana objetosc: "+sumaOjb);
        System.out.println(przedmioty);
    }

}
