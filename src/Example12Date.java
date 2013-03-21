import java.sql.Date;
import java.time.*;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Adjusters;
import java.time.zone.ZoneRules;
import java.util.Calendar;
import java.util.TimeZone;

public class Example12Date {

    public static void main(String[] args) {

        //Point of time
        java.time.Instant pointInTime = Instant.now();
        System.out.println(Instant.MAX + " " +Instant.MIN);

        //Period of time
        Duration duration = Duration.ofMinutes(2);
        System.out.println(duration);

        System.out.println(pointInTime.plus(duration));

        System.out.println(LocalDate.of(2012,Month.JUNE,10));

        System.out.println(LocalTime.of(10, 10));

        //ZONEOFFSET +14:00 -12:00
        System.out.println(LocalTime.now(ZoneOffset.UTC));

        //Government rules
        System.out.println("rules:");
        System.out.println(ZoneRules.of(ZoneOffset.UTC));
        System.out.println(ZoneRules.of(ZoneOffset.UTC).getTransitionRules());
        System.out.println(":" + ZoneRules.of(ZoneOffset.UTC).nextTransition(Instant.now()));
        //ZoneId

        //with... to return new Immutable object
        System.out.println("with:");
        LocalDate now = LocalDate.now();
        System.out.println(now.withYear(2016));
        System.out.println(now.withDayOfMonth(10));

        //leapYear
        System.out.println("leapYear:");
        System.out.println(now.isLeapYear());

        //adjusters
        System.out.println("adjusters");
        System.out.println(now.with(Adjusters.firstDayOfMonth()));
        System.out.println(now.with(Adjusters.dayOfWeekInMonth(1,DayOfWeek.TUESDAY)));

        //TimeZone
        TimeZone zone = TimeZone.getTimeZone("Europe/London");
        //@Injected - for test
        Clock clock = Clock.system(zone.toZoneId());

        Instant point = Instant.now(clock);

        //choose which to use
        LocalDateTime l = LocalDateTime.now();
        ZonedDateTime z = ZonedDateTime.now(zone.toZoneId());

        //Chronology ChronoDate - to write your own calendar systems
        Chronology chronology;

    }
}
