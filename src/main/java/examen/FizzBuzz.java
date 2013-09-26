package examen;

public class FizzBuzz {

	private static final int _BUZZ = 5;
	private static final int _FIZZ = 3;
	private static final String _MENSAJE_FIZZ = "Fizz";
	private static final String _MENSAJE_BUZZ = "Buzz";
	private static final String _MENSAJE_FIZZBUZZ = "FizzBuzz";

	public String genera(int i) {
		if (esMultiploDe(i, _FIZZ) && esMultiploDe(i, _BUZZ))
			return _MENSAJE_FIZZBUZZ;
		if (esMultiploDe(i, _FIZZ))
			return _MENSAJE_FIZZ;
		if (esMultiploDe(i, _BUZZ))
			return _MENSAJE_BUZZ;
		return String.valueOf(i);
	}

	private boolean esMultiploDe(int numero, int multiplo) {
		return numero % multiplo == 0;
	}
}
