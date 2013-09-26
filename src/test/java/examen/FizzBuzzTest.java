package examen;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void generaFizzCuandoNumeroEsTres() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Fizz", fb.genera(3));
	}
	
	@Test
	public void generaElMismoNumeroSiNoEsTres(){
		FizzBuzz fb = new FizzBuzz();
		assertEquals("4", fb.genera(4));
	}

}
