package cicli;

public class BreakContinue {

    public void Break(int interruttore, int estremo){

        for(int i = 0; i < estremo; i++){
            if(i == interruttore){
                System.out.println("i == interruttore!!!");
                break;
            }
            System.out.println("Iterazione numero " + i);
        }

        System.out.println("ciclo con break\n");
    }

    public void Continue(int interruttore, int estremo){

        for(int i = 0; i < estremo; i++){
            if(i == interruttore){
                System.out.println("i == interruttore!!!");
                continue;
            }
            System.out.println("Iterazione numero " + i);
        }

        System.out.println("ciclo con continue\n");
    }

    public static void main(String[] args) {

       BreakContinue bc = new BreakContinue();
       bc.Break(5, 10);
       bc.Continue(5,10);
    }
}
