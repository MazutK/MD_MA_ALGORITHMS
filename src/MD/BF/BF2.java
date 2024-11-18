package MD.BF;


public class BF2 {
    public static void main(String[] args) {
        int[][] przedmioty = {{6, 2, 3, 2, 3, 1},
                {6, 4, 5, 7, 10, 2}};

        int MAX_V = 10;


        String najlepszeRozwiazanie = "";
        int wartoscNajlepszegoRozwiazania = 0;

        for (int b0 = 0; b0 <= 1; b0++) {
            for (int b1 = 0; b1 <= 1; b1++) {
                for (int b2 = 0; b2 <= 1; b2++) {
                    for (int b3 = 0; b3 <= 1; b3++) {
                        for (int b4 = 0; b4 <= 1; b4++) {
                            for (int b5 = 0; b5 < 1; b5++) {


                                int bierzaceV = 0;
                                int bierzaceW = 0;
                                String bierzaceRozwiazanie = "";
                                if (b0 == 1) {
                                    bierzaceV += przedmioty[0][0];
                                    bierzaceW += przedmioty[1][0];
                                    bierzaceRozwiazanie += bierzaceRozwiazanie + " 0";
                                }
                                if (b1 == 1) {
                                    bierzaceV += przedmioty[0][1];
                                    bierzaceW += przedmioty[1][1];
                                    bierzaceRozwiazanie += bierzaceRozwiazanie + " 1";
                                }
                                if (b0 == 1) {
                                    bierzaceV += przedmioty[0][2];
                                    bierzaceW += przedmioty[1][2];
                                    bierzaceRozwiazanie += bierzaceRozwiazanie + " 2";
                                }
                                if (b0 == 1) {
                                    bierzaceV += przedmioty[0][3];
                                    bierzaceW += przedmioty[1][3];
                                    bierzaceRozwiazanie += bierzaceRozwiazanie + " 3";
                                }
                                if (b0 == 1) {
                                    bierzaceV += przedmioty[0][4];
                                    bierzaceW += przedmioty[1][4];
                                    bierzaceRozwiazanie += bierzaceRozwiazanie + " 4";
                                }
                                if (b0 == 1) {
                                    bierzaceV += przedmioty[0][5];
                                    bierzaceW += przedmioty[1][5];
                                    bierzaceRozwiazanie += bierzaceRozwiazanie + " 5";
                                }

                                if(bierzaceV <= MAX_V && bierzaceW >wartoscNajlepszegoRozwiazania){
                                    wartoscNajlepszegoRozwiazania = bierzaceW;
                                    najlepszeRozwiazanie = bierzaceRozwiazanie + "} V= "+bierzaceV +" W=" + bierzaceW;
                                    System.out.println(najlepszeRozwiazanie);
                                }

                            }
                        }

                    }

                }

            }

        }

        System.out.println("Najlepsze rozwiązanie: " + najlepszeRozwiazanie);
    }
}
