package calculadora;

public class Calculadora {

private int num1;
private int num2;
private int num3;

	public Calculadora(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
	public int sumar() {
			int resultado = num1 + num2;
			return resultado;
                      
	}
        public int multiplicar() {
			int resultado = num1 * num2;
			return resultado;
                      
	}
        public int restar() {
			int resultado = num1 - num2;
			return resultado;
                      
	}
        public int dividir() {
			int resultado = num1 / num2;
			return resultado;
                      
	}
}
        
