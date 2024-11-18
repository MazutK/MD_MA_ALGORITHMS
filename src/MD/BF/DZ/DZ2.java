package MD.BF.DZ;

public class DZ2 {
    public static void main(String[] args) {

        double poczatkowePKBPL = 6000d;
        double poczatkowePKBDE = 12000d;
        double wzrostRocznyPL = 0.06d;
        double wzrostRocznyDE = 0.012d;

        int lataDoPodwojeniaPL = obliczLata(poczatkowePKBPL, wzrostRocznyPL, poczatkowePKBPL * 2, 0);
        System.out.println("Do podwojenia pkb polskiego potrzeba " + lataDoPodwojeniaPL + " lat");


        for (int i = 0; i < 20; i++) {
            double pkbPL = wzrost(poczatkowePKBPL, wzrostRocznyPL, i);
            double pkbDE = wzrost(poczatkowePKBDE, wzrostRocznyDE, i);

            if (pkbPL >= pkbDE) {
                System.out.println("PKB Polski dorowna PKB Niemiec w ciagu " + i + " lat");
                break;
            }
        }
    }

    static int obliczLata(double poczatkowePKB, double rocznyWzorst, double cel, int lata) {
        if (poczatkowePKB >= cel) {
            return lata;
        } else {
            return obliczLata(poczatkowePKB * (1 + rocznyWzorst), rocznyWzorst, cel, lata + 1);
        }
    }

    static double wzrost(double poczatkowePKB, double rocznyWzrost, int lata) {
        if (lata == 0) {
            return poczatkowePKB;
        } else {
            return wzrost(poczatkowePKB * (1 + rocznyWzrost), rocznyWzrost, lata - 1);
        }
    }
}
