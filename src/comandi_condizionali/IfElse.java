package comandi_condizionali;

public class IfElse {

    public int recuperaIlMaggiore(int num1, int num2, int num3){
        int maggiore = 0;

        if(num1 > num2 && num1 > num3){
            maggiore = num1;
        }else if(num2 > num1 && num2 > num3){
            maggiore = num2;
        }else{
            maggiore = num3;
        }

        return maggiore;
    }

    public static void main(String[] args) {
        IfElse ie = new IfElse();
        int maggiore = ie.recuperaIlMaggiore(5, 3, 2);
        System.out.println(maggiore);//5
    }
}
