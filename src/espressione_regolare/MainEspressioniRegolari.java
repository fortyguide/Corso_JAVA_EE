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

        System.out.println("[...]");
        System.out.println("Sostituisce nel testo tutti i caratteri 'a' 'e' 'i' 'o' 'u' con 'H'");
        System.out.println(testo.replaceAll("[aeiou]", "H"));

        /* Output:
           LHrHm HpsHm dHlHr sHt HmHt, cHnsHctHtHr HdHpHscHng HlHt, sHd dH HHHsmHd tHmpHr HncHdHdHnt Ht lHbHrH
           Ht dHlHrH mHgnH HlHqHH. Ut HnHm Hd mHnHm vHnHHm, qHHs nHstrHd HxHrcHtHtHHn HllHmcH lHbHrHs nHsH Ht
           Hx HH cHmmHdH cHnsHqHHt. DHHs HHtH HrHrH dHlHr Hn rHprHhHndHrHt Hn vHlHptHtH vHlHt HssH cHllHm dHlHrH
           mHllHt HnHm Hd Hst lHbHrHm.
           LLLLLLLLLLLLLLLLLLLHLHLHrHm
           1974Hr1222
           $%Â£/())))=m
         */

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("[^...]");
        System.out.println("Sostituisce nel testo tutti i caratteri che non sono 'a' 'e' 'i' 'o' 'u' con 'H'");
        System.out.println(testo.replaceAll("[^aeiou]", "H"));

        /* Output:
           HoHeHHiHHuHHHoHoHHHiHHaHeHHHHoHHeHHeHuHHaHiHiHHiHHHeHiHHHHeHHHoHeiuHHoHHHeHHoHHiHHiHiHuHHHuHHHaHoHeH
           eHHHoHoHeHHaHHaHaHiHuaHHHHHeHiHHaHHHiHiHHHeHiaHHHHuiHHHoHHHuHHeHeHHiHaHioHHuHHaHHoHHaHoHiHHHiHiHuHH
           eHHeaHHoHHoHoHHoHHeHuaHHHHiuHHauHeHiHuHeHHoHoHHiHHHeHHeHeHHeHiHHiHHHoHiHHaHeHHeHiHHeHHeHHiHHuHHHoHoHeH
           HoHHiHHaHiHHiHHeHHHHaHoHuHHH
           HHHHHHHHHHHHHHHHHHHoHoHoHeH
           HHHeHHHHHH
           HHHHHHHHHHH
         */

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("[...-...]");
        System.out.println("Sostituisce nel testo tutti i caratteri che vanno dalla lettera 'a' alla lettera 'e' con 'H'");
        System.out.println(testo.replaceAll("[a-e]", "H"));

        /* Output:
           LorHm ipsum Holor sit HmHt, HonsHHtHtur HHipisHing Hlit, sHH Ho HiusmoH tHmpor inHiHiHunt ut lHHorH
           Ht HolorH mHgnH HliquH. Ut Hnim HH minim vHniHm, quis nostruH HxHrHitHtion ullHmHo lHHoris nisi ut
           Hx HH HommoHo HonsHquHt. Dius HutH irurH Holor in rHprHhHnHHrit in voliptHtH vHlit HssH Hillum HolorH
           mollit Hnim iH Hst lHHorum.
           LLLLLLLLLLLLLLLLLLLoLoLorHm
           1974Hr1222
           $%Â£/())))=m
        */

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("[...&&[...]]");
        System.out.println("Sostituisce nel testo tutti i caratteri in comune tra i due insiemi {A-Z} e {L} (in questo caso il carattere 'L') con 'H'");
        System.out.println(testo.replaceAll("[A-Z&&[L]]", "H"));

        /* Output:
           Horem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore
           et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
           ex ea commodo consequat. Dius aute irure dolor in reprehenderit in voliptate velit esse cillum dolore
           mollit anim id est laborum.
           HHHHHHHHHHHHHHHHHHHoHoHorem
           1974er1222
           $%Â£/())))=m
        */

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println(".");
        System.out.println("Sostituisce nel testo tutti i caratteri con 'H'");
        System.out.println(testo.replaceAll(".", "H"));

        /* Output:
           HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
           HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
           HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
           HHHHHHHHHHHHHHHHHHHHHHHHHHHH
           HHHHHHHHHHHHHHHHHHHHHHHHHHHH
           HHHHHHHHHHH
           HHHHHHHHHHHHH
         */

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("...+[...]");
        System.out.println("Sostituisce nel testo tutti i caratteri che si trovano nei due insiemi {A-Z} e {a-z} con 'K'");
        System.out.println(testo.replaceAll("[A-Z+[a-z]]", "K"));

        /* Output:
           KKKKK KKKKK KKKKK KKK KKKK, KKKKKKKKKKK KKKKKKKKKK KKKK, KKK KK KKKKKKK KKKKKK KKKKKKKKKK KK KKKKKK
           KK KKKKKK KKKKK KKKKKK. KK KKKK KK KKKKK KKKKKK, KKKK KKKKKKK KKKKKKKKKKKK KKKKKKK KKKKKKK KKKK KK
           KK KK KKKKKKK KKKKKKKKK. KKKK KKKK KKKKK KKKKK KK KKKKKKKKKKKKK KK KKKKKKKKK KKKKK KKKK KKKKKK KKKKKK
           KKKKKK KKKK KK KKK KKKKKKK.
           KKKKKKKKKKKKKKKKKKKKKKKKKKK
           1974er1222
           $%Â£/())))=m
         */

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("^[...]");
        System.out.println("Sostituisce nel testo solo il primo carattere, se si trova nell'intervallo {A-Z}, con 'K'");
        System.out.println(testo.replaceAll("^[A-Z]", "K"));

        /* Output:
           Korem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore
           et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
           ex ea commodo consequat. Dius aute irure dolor in reprehenderit in voliptate velit esse cillum dolore
           mollit anim id est laborum.
           LLLLLLLLLLLLLLLLLLLoLoLorem
           1974er1222
           $%Â£/())))=m
         */

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("[...]$");
        System.out.println("Sostituisce nel testo solo l'ultimo carattere, se si trova nell'intervallo {a-z}, con 'K'");
        System.out.println(testo.replaceAll("[a-z]$", "K"));

        /* Output:
           Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore
           et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
           ex ea commodo consequat. Dius aute irure dolor in reprehenderit in voliptate velit esse cillum dolore
           mollit anim id est laborum.
           LLLLLLLLLLLLLLLLLLLoLoLorem
           1974er1222
           $%Â£/())))=K
         */

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("a*");
        System.out.println("Sostituisce nel testo tutte le occorrenze 'Lo' con 'H'");
        System.out.println(testo.replaceAll("Lo*", "H"));

        /* Output:
           Hrem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore
           et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
           ex ea commodo consequat. Dius aute irure dolor in reprehenderit in voliptate velit esse cillum dolore
           mollit anim id est laborum.
           HHHHHHHHHHHHHHHHHHHHHrem
           1974er1222
           $%Â£/())))=m
         */

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("a{n}");
        System.out.println("Sostituisce nel testo 'LL' con 'H'");
        System.out.println(testo.replaceAll("L{2}", "H"));

        /* Output:
           Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore
           et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
           ex ea commodo consequat. Dius aute irure dolor in reprehenderit in voliptate velit esse cillum dolore
           mollit anim id est laborum.
           HHHHHHHHHLoLoLorem
           1974er1222
           $%Â£/())))=m
         */

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("a{n,}");
        System.out.println("Sostituisce nel testo le occorrenze che presentano un numero di L attaccate almeno = 2 con 'H'");
        System.out.println(testo.replaceAll("L{2,}", "H"));

        /* Output:
           Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore
           et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
           ex ea commodo consequat. Dius aute irure dolor in reprehenderit in voliptate velit esse cillum dolore
           mollit anim id est laborum.
           HoLoLorem
           1974er1222
           $%Â£/())))=m
         */

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("a{n,m}");
        System.out.println("Sostituisce nel testo le occorrenze che presentano un numero di L attaccate almeno = 2, ma non maggiore di 4, con 'H'");
        System.out.println(testo.replaceAll("L{2,4}", "H"));

        /* Output:
           Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore
           et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
           ex ea commodo consequat. Dius aute irure dolor in reprehenderit in voliptate velit esse cillum dolore
           mollit anim id est laborum.
           HHHHHoLoLorem
           1974er1222
           $%Â£/())))=m
         */

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("\\d");
        System.out.println("Sostituisce nel testo tutti i numeri con 'H'");
        System.out.println(testo.replaceAll("\\d", "H"));

        /* Output:
           Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore
           et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
           ex ea commodo consequat. Dius aute irure dolor in reprehenderit in voliptate velit esse cillum dolore
           mollit anim id est laborum.
           LLLLLLLLLLLLLLLLLLLoLoLorem
           HHHHerHHHH
           $%Â£/())))=m
         */

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("\\D");
        System.out.println("Sostituisce nel testo tutti i caratteri che non sono numeri con 'H'");
        System.out.println(testo.replaceAll("\\D", "H"));

        /* Output:
           HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
           HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
           HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
           HHHHHHHHHHHHHHHHHHHHHHHHHHHH
           HHHHHHHHHHHHHHHHHHHHHHHHHHHH
           1974HH1222
           HHHHHHHHHHHHH
         */

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("\\s");
        System.out.println("Sostituisce nel testo tutti gli spazi con 'H'");
        System.out.println(testo.replaceAll("\\s", "H"));

        /* Output:
           LoremHipsumHdolorHsitHamet,HconsecteturHadipiscingHelit,HsedHdoHeiusmodHtemporHincididuntHutHlaboreH
           etHdoloreHmagnaHaliqua.HUtHenimHadHminimHveniam,HquisHnostrudHexercitationHullamcoHlaborisHnisiHutH
           exHeaHcommodoHconsequat.HDiusHauteHirureHdolorHinHreprehenderitHinHvoliptateHvelitHesseHcillumHdoloreH
           mollitHanimHidHestHlaborum.H
           LLLLLLLLLLLLLLLLLLLoLoLorem
           1974er1222
           $%Â£/())))=m
         */

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("\\S");
        System.out.println("Sostituisce nel testo tutti i caratteri, tranne lo spazio, con 'H'");
        System.out.println(testo.replaceAll("\\S", "H"));

        /* Output:
           HHHHH HHHHH HHHHH HHH HHHHH HHHHHHHHHHH HHHHHHHHHH HHHHH HHH HH HHHHHHH HHHHHH HHHHHHHHHH HH HHHHHH
           HH HHHHHH HHHHH HHHHHHH HH HHHH HH HHHHH HHHHHHH HHHH HHHHHHH HHHHHHHHHHHH HHHHHHH HHHHHHH HHHH HH
           HH HH HHHHHHH HHHHHHHHHH HHHH HHHH HHHHH HHHHH HH HHHHHHHHHHHHH HH HHHHHHHHH HHHHH HHHH HHHHHH HHHHHH
           HHHHHH HHHH HH HHH HHHHHHHH
           HHHHHHHHHHHHHHHHHHHHHHHHHHH
           HHHHHHHHHH
           HHHHHHHHHHHH
         */

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("\\w");
        System.out.println("Sostituisce nel testo tutti i caratteri, tranne quelli speciali, con 'H'");
        System.out.println(testo.replaceAll("\\w", "H"));

        /* Output:
           HHHHH HHHHH HHHHH HHH HHHH, HHHHHHHHHHH HHHHHHHHHH HHHH, HHH HH HHHHHHH HHHHHH HHHHHHHHHH HH HHHHHH
           HH HHHHHH HHHHH HHHHHH. HH HHHH HH HHHHH HHHHHH, HHHH HHHHHHH HHHHHHHHHHHH HHHHHHH HHHHHHH HHHH HH
           HH HH HHHHHHH HHHHHHHHH. HHHH HHHH HHHHH HHHHH HH HHHHHHHHHHHHH HH HHHHHHHHH HHHHH HHHH HHHHHH HHHHHH
           HHHHHH HHHH HH HHH HHHHHHH.
           HHHHHHHHHHHHHHHHHHHHHHHHHHH
           HHHHHHHHHH
           $%Â£/())))=H
         */

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("\\W");
        System.out.println("Sostituisce nel testo solo i caratteri speciali con 'H'");
        System.out.println(testo.replaceAll("\\W", "H"));

        /* Output:
           LoremHipsumHdolorHsitHametHHconsecteturHadipiscingHelitHHsedHdoHeiusmodHtemporHincididuntHutHlaboreH
           etHdoloreHmagnaHaliquaHHUtHenimHadHminimHveniamHHquisHnostrudHexercitationHullamcoHlaborisHnisiHutH
           exHeaHcommodoHconsequatHHDiusHauteHirureHdolorHinHreprehenderitHinHvoliptateHvelitHesseHcillumHdoloreH
           mollitHanimHidHestHlaborumHH
           LLLLLLLLLLLLLLLLLLLoLoLorem
           1974er1222
           HHHHHHHHHHHm
         */

        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }
}
