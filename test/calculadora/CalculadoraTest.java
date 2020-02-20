/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
     @Test
    public void testSumar() {
        Calculadora objetoCalculadora = new Calculadora(2, 3);
        assertTrue(objetoCalculadora.sumar() == 5);
    }
    
     @Test
    public void testSumarPositivoYNegativo() {
          Calculadora objetoCalculadora = new Calculadora(-2, 3);
          assertEquals(1,objetoCalculadora.sumar());
    }
    
    @Test
    public void testSumarNegativoYNegativo() {
          Calculadora objetoCalculadora = new Calculadora(-2, -3);
          assertEquals(-5,objetoCalculadora.sumar());
    }
    
    public void testSumar2() {
        Calculadora objetoCalculadora = new Calculadora(6, 3);
        assertTrue(objetoCalculadora.sumar() == 9);
    }
    
    public void testSumar3() {
        Calculadora objetoCalculadora = new Calculadora(10, 3);
        assertTrue(objetoCalculadora.sumar() == 13);
    }
    
    public void testSumar4() {
        Calculadora objetoCalculadora = new Calculadora(100, -50);
        assertTrue(objetoCalculadora.sumar() == 50);
    }
    
    @Test
    public void testMultiplicar() {
          Calculadora objetoCalculadora = new Calculadora(2, 3);
          assertEquals(6,objetoCalculadora.multiplicar());
    }
    
    public void testMultiplicar2() {
          Calculadora objetoCalculadora = new Calculadora(2, 5);
          assertEquals(10,objetoCalculadora.multiplicar());
    }
    
    public void testMultiplicar3() {
          Calculadora objetoCalculadora = new Calculadora(2, -3);
          assertEquals(-6,objetoCalculadora.multiplicar());
    }
    
    public void testRestar() {
          Calculadora objetoCalculadora = new Calculadora(2, 3);
          assertEquals(-1,objetoCalculadora.restar());
    }
    
    public void testRestar2() {
          Calculadora objetoCalculadora = new Calculadora(2, -3);
          assertEquals(5,objetoCalculadora.restar());
    }
    
    public void testRestar3() {
          Calculadora objetoCalculadora = new Calculadora(-2, 3);
          assertEquals(-5,objetoCalculadora.restar());
    }
    
    public void testDividir() {
          Calculadora objetoCalculadora = new Calculadora(3, 3);
          assertEquals(1,objetoCalculadora.dividir());
    }
    
    public void testDividir2() {
          Calculadora objetoCalculadora = new Calculadora(9, 3);
          assertEquals(3,objetoCalculadora.dividir());
    }
    
    public void testDividir3() {
          Calculadora objetoCalculadora = new Calculadora(10, 5);
          assertEquals(2,objetoCalculadora.dividir());
    }
}
