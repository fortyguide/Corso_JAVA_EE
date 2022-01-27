package modificatori2;

import modificatori1.Persona;

public class MainPersonaModificatori2 {

    public static void main(String[] args) {
        Persona p = new Persona();

        p.cammina();
        p.dormi(); //dormi() is not public in modificatori1.Persona;
        p.bevi(); //bevi() has private access in modificatori1.Persona
        p.mangia(); //mangia() has protected access in modificatori1.Persona
    }
}
