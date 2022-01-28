package comandi_condizionali;

public class SwitchCase {

    public String switchSenzaBreak(int codice){
        String testo = null;

        switch (codice){
            case 1:
                testo = "codice 1";

            case 2:
                testo = "codice 2";
            case 3:
                testo = "codice 3";
        }
        return testo;
    }

    public String switchConBreak(int codice){
        String testo = null;

        switch (codice){
            case 1:
                testo = "codice 1";
                break;

            case 2:
                testo = "codice 2";
                break;
            case 3:
                testo = "codice 3";
                break;
        }
        return testo;
    }

    public static void main(String[] args) {

        SwitchCase sc = new SwitchCase();
        String testoDaSwitchSenzaBreak = sc.switchSenzaBreak(1);
        String testoDaSwitchConBreak = sc.switchConBreak(1);
        System.out.println(testoDaSwitchSenzaBreak);//codice 3
        System.out.println(testoDaSwitchConBreak);//codice 1

    }
}
