package data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class EsempioSimpleDateFormat {
    public static void main(String[] args) {
        EsempioSimpleDateFormat esempioSimpleDateFormat = new EsempioSimpleDateFormat();

        esempioSimpleDateFormat.esSimpleDateFormat();
    }

    private void esSimpleDateFormat() {
        Calendar c = new GregorianCalendar();
        c.set(Calendar.YEAR, 2017);
        c.set(Calendar.MONTH, 4);
        c.set(Calendar.DATE, 29);
        c.set(Calendar.HOUR, 10);
        c.set(Calendar.MINUTE, 30);
        c.set(Calendar.SECOND, 25);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String data = sdf.format(c.getTime());

        System.out.println(data); // 29/05/2017

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");

        String data2 = sdf2.format(c.getTime());

        System.out.println(data2); // 29/05/2017 - 22:30:25
    }
}
