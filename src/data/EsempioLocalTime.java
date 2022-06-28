package data;

import java.time.LocalTime;

public class EsempioLocalTime {
    public static void main(String[] args) {
        EsempioLocalTime esempioLocalTime = new EsempioLocalTime();

        esempioLocalTime.esLocalTime();
    }

    private void esLocalTime() {
        LocalTime localTime = LocalTime.of(9, 30);

        System.out.println(localTime); // 09:30
        System.out.println(localTime.getHour()); // 9
        System.out.println(localTime.getMinute()); // 30

        LocalTime localTime2 = LocalTime.from(localTime);
        localTime2 = localTime.withSecond(10);
        System.out.println(localTime2); // 09:30:10

        LocalTime localTime3 = LocalTime.from(localTime);
        localTime3 = localTime.plusMinutes(3);
        System.out.println(localTime3); // 09:33

        LocalTime localTime4 = LocalTime.from(localTime);
        localTime4 = localTime.minusHours(3);
        System.out.println(localTime4); // 06:30
    }
}
