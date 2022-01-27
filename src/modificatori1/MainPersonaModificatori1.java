package modificatori1;

public class MainPersonaModificatori1 {

    public static void main(String[] args) {
        Persona p = new Persona();

        p.cammina();
        p.dormi();
        p.bevi(); //bevi() has private access in modificatori1.Persona
        p.mangia();
    }
}
