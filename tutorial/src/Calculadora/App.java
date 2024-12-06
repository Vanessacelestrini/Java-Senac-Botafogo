package Calculadora;

public class App {

	public static void main(String[] args) 
	{
		Calculadora calc = new Calculadora();
		
		String mensagem = "Multiplicação:";
			
		System.out.println(mensagem + calc.multiplicar(7,8));
		
		System.out.println(mensagem + calc.multiplicar(10,5));
		
		System.out.println("A soma é: " + calc.somar(6,6));
		
	}

}
