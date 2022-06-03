package espressioni_lambda;

public class Main {

    public static void main(String[] args) {
        EsempioFunctionalInterfaceFormaGeometrica Rettangolo = (a,b) -> a * b;

        Rettangolo.calcolaArea(3, 4);
    }
}
