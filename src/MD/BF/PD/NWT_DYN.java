package MD.BF.PD;

public class NWT_DYN {
    final static int N = 10;
    final static int K = 3;

    public static void main(String[] args) {
        System.out.println(newtonDz(N, K));
        int[][] tab = newtonPD(N, K);
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j <= i && j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int newtonDz(int n, int k) {//koncowy wynik
        if (k == 0 || k == n) {
            return 1;
        }
        if (0 < k && k < n) {
            return newtonDz(n - 1, k - 1) + newtonDz(n - 1, k);
        }
        return 1;

    }

    public static int[][] newtonPD(int n, int k) {
        int[][] tabTemp = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                if (j == 0 || j == i) {
                    tabTemp[i][j] = 1;
                }
                if (0 < j && j < i) {
                    tabTemp[i][j] = tabTemp[i - 1][j - 1] + tabTemp[i - 1][j];
                }

            }

        }
        return tabTemp;
    }


}
