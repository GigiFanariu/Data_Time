import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class Data_1 {
        public static void main(String[] args) {
            LocalDate currentDate = LocalDate.now();

            LocalDate lastDayOfMonth = currentDate.withDayOfMonth(currentDate.lengthOfMonth());
            long daysLeftTillEndOfMonth = ChronoUnit.DAYS.between(currentDate, lastDayOfMonth);

            Year currentYear = Year.of(currentDate.getYear());
            LocalDate lastDayOfYear = currentDate.withDayOfYear(currentYear.length());
            long daysLeftTillEndOfYear = ChronoUnit.DAYS.between(currentDate, lastDayOfYear);

            System.out.println("Days left till the end of the month: " + daysLeftTillEndOfMonth);
            System.out.println("Days left till the end of the year: " + daysLeftTillEndOfYear);
        }


}
