package MA.AZ.BL;

import java.util.Random;

public class KO_BL {
    static int[][] daneKosmo = {
            {1, 0, 0, 1},
            {0, 1, 0, 1},
            {0, 1, 1, 0},
            {1, 1, 0, 0},
            {0, 0, 1, 1}
    };


    public static void main(String[] args) {
        Random rand = new Random();

        int liczbaK = Integer.MAX_VALUE;

        int spec = 4;

        String najlepszeRozwiazanie = "";

        boolean[] wybraniK = new boolean[daneKosmo.length];

        for (int i = 0; i < 100; i++) {


            int[] specK = new int[spec];

            int liczbaWybranych = 0;

            String biezaceRozwiazanie = " ";

            int index = 0;

            index = rand.nextInt(daneKosmo.length);

            if (rand.nextBoolean()) {
                wybraniK[index] = !wybraniK[index];
            }

            for (int j = 0; j < daneKosmo.length; j++) {
                if (wybraniK[j]) {
                    for (int k = 0; k < spec; k++) {
                        specK[k] += daneKosmo[j][k];
                    }
                    biezaceRozwiazanie += " " + (j + 1) + " ";
                    liczbaWybranych++;
                }
            }


            if (specK[0] > 0 && specK[1] > 0 && specK[2] > 0 && specK[3] > 0 && liczbaWybranych < liczbaK) {
                liczbaK = liczbaWybranych;
                najlepszeRozwiazanie = biezaceRozwiazanie;
            }


        }
        System.out.println("Wybrani na misję : " + najlepszeRozwiazanie);
        System.out.println("Członków załogi: " + liczbaK);


    }
}
