package comando_return;

public class Return {

    public int recuperaIlMaggiore(int num1, int num2, int num3){
        if(num1 > num2 && num1 > num3){
            return num1;
        }else if(num2 > num1 && num2 > num3){
            return num2;
        }else{
           return num3;
        }
    }

    public String recuperaCodice(int codice){
        switch (codice){
            case 1:
                return "codice 1";
            case 2:
                return "codice 2";
            case 3:
                return "codice 3";
        }
        return "";
    }

    public static void main(String[] args) {

        Return r = new Return();
        int maggiore = r.recuperaIlMaggiore(5, 3, 2);
        String testo = r.recuperaCodice(1);
        System.out.println(maggiore);//5
        System.out.println(testo);//codice 1
    }
}
