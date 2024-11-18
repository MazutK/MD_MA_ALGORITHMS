package MD.BF.DZ;

public class PKB_DYN {
    static float pkbPL=6000;
    static float pkbNIEM=12000;
    static float stopa = 0.06f;

    public static void main(String[] args) {

        float[] tab = pkbDYN(26);

        for (int i = 0; i < tab.length; i++) {
            if(tab[i]>=pkbNIEM){
                System.out.println("PKB Polski podwoi się po: "+i +" latach.");
                System.out.println("i wyniesie: "+pkbRekur(i));
                break;
            }
        }

    }
    public static float[] pkbDYN(int n){
        float[] tempTab = new float[n+1];
        tempTab[0]=pkbPL;
        for (int i = 1; i < tempTab.length; i++) {
            tempTab[i]=tempTab[i-1]*(1+0.06f);
        }
        return tempTab;
    }

    public static float pkbRekur(int n){
        if(n==0){
            return pkbPL;
        }else{
            return pkbRekur(n-1)*(1+0.06f);
        }

    }



}
