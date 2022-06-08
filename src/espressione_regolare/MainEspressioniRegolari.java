package espressione_regolare;

public class MainEspressioniRegolari {

    public static void main(String[] args) {

        String testo =
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore " +
                "et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut " +
                "ex ea commodo consequat. Dius aute irure dolor in reprehenderit in voliptate velit esse cillum dolore " +
                "mollit anim id est laborum. " +
                "LLLLLLLLLLLLLLLLLLLoLoLorem"+
                "1974er1222"+
                "$%£/())))=m";

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println(" [...] ");
        System.out.println("Sostituisce nel testo tutti i caratteri 'a' 'e' 'i' 'o' 'u' con 'H'");
        System.out.println(testo.replaceAll("[aeiou]", "H"));

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println(" [^...] ");
        System.out.println("Sostituisce nel testo tutti i caratteri che non sono 'a' 'e' 'i' 'o' 'u' con 'H'");
        System.out.println(testo.replaceAll("[^aeiou]", "H"));

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println(" [...-...] ");
        System.out.println("Sostituisce nel testo tutti i caratteri che vanno dalla lettera 'a' alla lettera 'e' con 'H'");
        System.out.println(testo.replaceAll("[a-e]", "H"));

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println(" [...&&[...]] ");
        System.out.println("Sostituisce nel testo tutti i caratteri in comune tra i due insiemi {A-Z} e {L} (in questo caso il carattere 'L') con 'H'");
        System.out.println(testo.replaceAll("[A-Z&&[L]]", "H"));

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        //7:30

    }
}
