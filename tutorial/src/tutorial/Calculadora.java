package tutorial;

public class Calculadora {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		calc.somar(2, 2);
		calc.somar(4, 3);
		calc.somar(5, 5);
	
		calc.multiplicar(2, 2);
		calc.multiplicar(4, 3);
		calc.multiplicar(5, 5);
		

	}
	
	public void somar(int n1, int n2)
	{
		int valor = n1 + n2;
		System.out.println(valor);
		
	}

	public void multiplicar(int n1, int n2)
	{
		int valor = n1 * n2;
		System.out.println(valor);
		
	}
	
}
