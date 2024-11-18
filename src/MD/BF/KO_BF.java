package MD.BF;

public class KO_BF {
    static final int[][] daneKosmo = {
            {1, 0, 0, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 1, 0, 1},
            {1, 1, 0, 0, 1}
    };

    public static void main(String[] args) {
        int liczbaK = Integer.MAX_VALUE;
        String najlepszeRozwiazanie = " ";


        for (int k1 = 0; k1 <= 1; k1++) {
            for (int k2 = 0; k2 <= 1; k2++) {
                for (int k3 = 0; k3 <= 1; k3++) {
                    for (int k4 = 0; k4 <= 1; k4++) {
                        for (int k5 = 0; k5 <= 1; k5++) {
                            int A = 0, B = 0, C = 0, D = 0;
                            int obecniK = 0;
                            String bierzacyWynik = " ";
                            if (k1 == 1) {
                                A += daneKosmo[0][0];
                                B += daneKosmo[1][0];
                                C += daneKosmo[2][0];
                                D += daneKosmo[3][0];
                                obecniK++;
                                bierzacyWynik += "k1, ";
                            }
                            if (k2 == 1) {
                                A += daneKosmo[0][1];
                                B += daneKosmo[1][1];
                                C += daneKosmo[2][1];
                                D += daneKosmo[3][1];
                                obecniK++;
                                bierzacyWynik += "k2, ";
                            }
                            if (k3 == 1) {
                                A += daneKosmo[0][2];
                                B += daneKosmo[1][2];
                                C += daneKosmo[2][2];
                                D += daneKosmo[3][2];
                                obecniK++;
                                bierzacyWynik += "k3, ";
                            }
                            if (k4 == 1) {
                                A += daneKosmo[0][3];
                                B += daneKosmo[1][3];
                                C += daneKosmo[2][3];
                                D += daneKosmo[3][3];
                                obecniK++;
                                bierzacyWynik += "k4, ";
                            }
                            if (k5 == 1) {
                                A += daneKosmo[0][4];
                                B += daneKosmo[1][4];
                                C += daneKosmo[2][4];
                                D += daneKosmo[3][4];
                                obecniK++;
                                bierzacyWynik += "k5, ";
                            }
                            if (A > 0 && B > 0 && C > 0 && D >0 && obecniK < liczbaK) {
                                najlepszeRozwiazanie = bierzacyWynik;
                                liczbaK = obecniK;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(najlepszeRozwiazanie);
        System.out.println("Liczba kosmonautow: "+liczbaK);
    }
}
