package Zoo;

public class App {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Cachorro cao = new Cachorro ();
		Jacare jaca = new Jacare ();
		
		jaca.setNome("Jacaré");
		jaca.setPeso(50);
	    jaca.setRaca("Papo Amarelo");
	    System.out.println(jaca.getNome());
		jaca.brincar();
		jaca.setCor("Amarelo");
		System.out.println("Peso " + jaca.getPeso() + "Kg");
		System.out.println("O jacaré é : " + jaca.getCor());
		
		cao.setNome("Cachorro");
		cao.setPeso(13);
		cao.setRaca("Dobermann");
		System.out.println(cao.getNome());
		cao.brincar();
		cao.setCor("Preto");
		System.out.println("Peso " + cao.getPeso() + "Kg");
		System.out.println("O cachorro é : " + cao.getCor());
		
		
	    gato.setNome("Gato");
		gato.setPeso(3);
		gato.setRaca("Vira Lata");
		System.out.println(gato.getNome());
		gato.brincar();
		gato.setCor("Branco");
		System.out.println("Peso " + gato.getPeso() + "Kg");
		System.out.println("O Gato é : " + gato.getCor());
	
	
	}
	
	
}


