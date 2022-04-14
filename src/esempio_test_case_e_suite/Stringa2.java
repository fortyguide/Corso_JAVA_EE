package esempio_test_case_e_suite;

public class Stringa2 {

    public static void main(String[] args) {
        Stringa stringa = new Stringa();

        int oc = stringa.calcoloNumeroOccorrenze("Lorem ipsum test prova Paolo", "m");

        System.out.println(oc);
    }

    public int calcoloNumeroOccorrenze(String str, String token){
        int nOccorrenze = 0;

        for (int i = 0; i <= str.length()-token.length(); i++){
            String temp = str.substring(i, i + token.length());
            if(temp.equals(token)){
                nOccorrenze++;
            }

        }
        return nOccorrenze;
    }
}
