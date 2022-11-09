package varargs;

public class Varargs {

    public String concatena(String... vars){
        String out = "";

        for(int i = 0; i < vars.length; i++){
            out += vars[i];
        }

        return out;
    }

    public static void main(String[] args) {

        Varargs a = new Varargs();
        String d = a.concatena("Paolo", "Preite", "Corso", "Java");

        System.out.println(d);//PaoloPreiteCorsoJava

    }
}
