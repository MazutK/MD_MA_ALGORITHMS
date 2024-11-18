package MD.BF.PD;

public class PKB_DIZ {

    public static float pkbDZ(int n){
        if(n==0){
            return 6000;
        }else{
            return pkbDZ(n-1)*(1+0.06f);
        }
    }
    public static int poIluLatachPodwojenie(int n) {
        float tab[] = new float[n+1];
        tab[0] = 6000;

        for (int i = 1; i < n; i++) {
            tab[i] = tab[i-1]*(1+0.06f);
            if(tab[i]>12000){
                System.out.println("Minęło: "+i+" lat.");
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        poIluLatachPodwojenie(20);
    }
}
