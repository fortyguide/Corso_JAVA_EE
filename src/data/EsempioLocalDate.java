package data;

import java.time.LocalDate;

public class EsempioLocalDate {
    public static void main(String[] args) {
        EsempioLocalDate esempioLocalDate = new EsempioLocalDate();

        esempioLocalDate.esLocalDate();
    }

    private void esLocalDate() {
        LocalDate localDate = LocalDate.of(2017, 3, 29);

        System.out.println(localDate.isLeapYear()); // false
        System.out.println(localDate.lengthOfMonth()); // 31
        System.out.println(localDate.getDayOfWeek()); // WEDNESDAY

        LocalDate localDate2 = LocalDate.from(localDate);
        localDate2 = localDate.withYear(2016);
        System.out.println(localDate2); // 2017-03-29

        LocalDate localDate3 = LocalDate.from(localDate);
        localDate3 = localDate.plusMonths(2); // 2017-05-29
        System.out.println(localDate3);

        LocalDate localDate4 = LocalDate.from(localDate);
        localDate4 = localDate.minusDays(5); // 2017-03-24
        System.out.println(localDate4);
    }
}
