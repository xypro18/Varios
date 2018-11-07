package pt.rumos.cursos.academia201809.drinks4us.helper;

import java.time.LocalDate;
import java.util.Random;

public class DatasHelper {
	
	/**
	 * Devolve uma data random
	 * 
	 * @return LocalDate
	 */
	
	public static LocalDate dameUmaData() {
		return LocalDate
		.now()
		.minusYears(18)
		.minusYears(new Random().nextInt(60))
		.plusMonths(new Random().nextInt(60))
		.plusDays((new Random().nextInt(28)));
		
	}

}
