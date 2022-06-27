package data;

import java.util.Date;

public class EsempioDate {

    public static void main(String[] args) {
        EsempioDate esempioDate = new EsempioDate();

        esempioDate.esDate();
    }

    private void esDate() {
        Date data = new Date();

        /* Valore della data in Timestamp*/
        System.out.println(data.getTime());// 1656335159459

        System.out.println(data.toString()); // Mon Jun 27 15:01:09 CEST 2022
    }

}
