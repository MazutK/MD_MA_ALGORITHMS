package MD.BF;

public class PLECAK_BF {
    final static int N = 6; // <- liczba przedmiotow w plecaku
    final static int MAX_V = 10; // <- objetosc plecka

    final static int[] OBJETOSCI_P = {6, 2, 3, 2, 3, 1}; // <- objetosci przedmitow
    final static int[] WARTOSCI_P = {6, 4, 5, 7, 10, 2}; // <- wartosci przedmiotow

    public static void main(String[] args) {
        int najlepszaW = 0;
        int najlepszeV =0;
        String przedmioty = "";
        int liczbaPrzedmiotow = 0;
        for (int p1 = 0; p1 <= 1; p1++) {
            for (int p2 = 0; p2 <= 1; p2++) {
                for (int p3 = 0; p3 <= 1; p3++) {
                    for (int p4 = 0; p4 <= 1; p4++) {
                        for (int p5 = 0; p5 <= 5; p5++) {
                            for (int p6 = 0; p6 <= 1; p6++) {


                                int obecneW = 0;
                                int obecneV = 0;
                                int obecnePrzedmioty = 0;
                                String wybrane = "";
                                if (p1 == 1) {
                                    obecneW += WARTOSCI_P[0];
                                    obecneV += OBJETOSCI_P[0];
                                    obecnePrzedmioty++;
                                    wybrane += " p1 ";

                                }
                                if (p2 == 1) {
                                    obecneW += WARTOSCI_P[1];
                                    obecneV += OBJETOSCI_P[1];
                                    obecnePrzedmioty++;
                                    wybrane += " p2 ";

                                }
                                if (p3 == 1) {
                                    obecneW += WARTOSCI_P[2];
                                    obecneV += OBJETOSCI_P[2];
                                    obecnePrzedmioty++;
                                    wybrane += " p3 ";

                                }
                                if (p4 == 1) {
                                    obecneW += WARTOSCI_P[3];
                                    obecneV += OBJETOSCI_P[3];
                                    obecnePrzedmioty++;
                                    wybrane += " p4 ";

                                }
                                if (p5 == 1) {
                                    obecneW += WARTOSCI_P[4];
                                    obecneV += OBJETOSCI_P[4];
                                    obecnePrzedmioty++;
                                    wybrane += " p5 ";

                                }

                                if (p6 == 1) {
                                    obecneW += WARTOSCI_P[5];
                                    obecneV += OBJETOSCI_P[5];
                                    obecnePrzedmioty++;
                                    wybrane += " p6 ";

                                }
                                if (obecneW > najlepszaW && obecneV < MAX_V) {
                                    najlepszeV=obecneV;
                                    najlepszaW=obecneW;
                                    przedmioty=wybrane;
                                    liczbaPrzedmiotow=obecnePrzedmioty;
                                }


                            }

                        }

                    }

                }

            }

        }
        System.out.println("Wartość najlepszego rozwiązania: "+najlepszaW);
        System.out.println("Objętość najlepszego rozwiązania: "+najlepszeV);
        System.out.println("Wybranych przedmiotów: "+liczbaPrzedmiotow);
        System.out.println("Wybrane przedmioty to: "+przedmioty);
    }
}
