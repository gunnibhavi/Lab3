import java.time.LocalDate;
import java.time.Period;

/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to find the duration in days,months,years
 * Date=03/19/2021
 */
public class DaysDuration {

	public static void main(String[] args) {
		LocalDate date=LocalDate.of(2020, 04, 24);
		LocalDate now=LocalDate.now();
		
		Period diff=Period.between(date, now);
		
		System.out.println("Difference in year is: "+diff.getYears()+"Years"+
		diff.getMonths()+"Months"+diff.getDays()+"Days");
		

	}

}
