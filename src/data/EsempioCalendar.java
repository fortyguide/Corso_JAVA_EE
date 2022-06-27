package data;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EsempioCalendar {

    public static void main(String[] args) {
        EsempioCalendar esempioCalendar = new EsempioCalendar();

        esempioCalendar.esCalendar();
    }

    private void esCalendar() {
        Calendar cal = Calendar.getInstance();

        Calendar cal2 = new GregorianCalendar();

        /* setTime() imposta come data del Calendar, l'istante in cui creaimo l'istanza della classe Date */
        cal.setTime(new Date());

        /* il metodo set, che prende in ingresso due parametri, ci consente di specificare mediante il primo
        parametro cosa vogliamo settare (giorno, mese, anno, minuto, secondo), mentre mediante il secondo
        parametro il valore */
        cal2.set(Calendar.YEAR, 2000);
        cal2.set(Calendar.MONTH, 10); /* I mesi vanno da 0 a 11*/
        cal2.set(Calendar.DATE, 29);

        System.out.println(cal2.getTime()); // Wed Nov 29 15:54:40 CET 2000

        /* get() permette di recuperare il pezzo di data richiesto*/
        System.out.println(cal2.get(Calendar.YEAR)); // 2000
    }
}
