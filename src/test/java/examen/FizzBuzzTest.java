package examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	private FizzBuzz fb;
	
	@Before
	public void setup(){
		fb = new FizzBuzz();
	}
	
	@Test
	public void generaFizzCuandoNumeroEsTres() {
		assertEquals("Fizz", fb.genera(3));
	}
	
	@Test
	public void generaElMismoNumeroSiNoEsTres(){
		assertEquals("4", fb.genera(4));
	}
	
	@Test
	public void generarFizzSiElNumeroEsMultiploDeTres(){
		assertEquals("Fizz", fb.genera(6));
	}
	
	@Test
	public void generarBuzzSiElNumeroEsCinco(){
		assertEquals("Buzz", fb.genera(5));
	}
	
	@Test
	public void generarBuzzSiElNumeroEsMultiploDeCinco(){
		assertEquals("Buzz", fb.genera(10));
	}
	
	@Test
	public void generarFizzBuzzSiElNumeroEsQuince(){
		assertEquals("FizzBuzz", fb.genera(15));
	}
	
	@Test
	public void generarFizzBuzzSiElNumeroEsMultiploDeTresYCinco(){
		assertEquals("FizzBuzz", fb.genera(30));
	}
	
	@Test
	public void imprimirEnPantallaSecuenciaFizzBuzz(){
		String esperado = "1\n"+
						  "2\n"+
						  "Fizz\n"+
						  "4\n"+
						  "Buzz\n"+
						  "Fizz\n";
		assertEquals(esperado, fb.imprimir(6));
	}
}
