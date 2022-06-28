package data;

import java.time.Duration;
import java.time.LocalTime;

public class EsempioPeriodDuration {
    public static void main(String[] args) {
        EsempioPeriodDuration esempioPeriodDuration = new EsempioPeriodDuration();

        esempioPeriodDuration.esPeriodDuration();
    }

    private void esPeriodDuration() {
        Duration d1 = Duration.ofSeconds(10,40);

        System.out.println(d1.getSeconds()); // 10
        System.out.println(d1.getNano()); // 40

        LocalTime aperturaNegozio = LocalTime.of(9,30);
        LocalTime chiusuraNegozio = LocalTime.of(13,30);

        Duration d2 = Duration.between(aperturaNegozio, chiusuraNegozio);
        System.out.println(d2.getSeconds()); // 14400
        System.out.println(d2.getNano()); // 0

        /* Analogamente posso usare il Period, però manipolando gli oggetti LocalDate */
    }
}
