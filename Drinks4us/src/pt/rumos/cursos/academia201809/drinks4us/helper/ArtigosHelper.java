package pt.rumos.cursos.academia201809.drinks4us.helper;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Random;

public class ArtigosHelper {
	
	public static double dameUmPrecoAte(int limite) {
		return new BigDecimal(new Random().nextDouble() * limite).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}

}
