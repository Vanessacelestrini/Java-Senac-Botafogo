package mergulho;


public class App {


	public static void main(String[] args) {
		Arpao arpao =new Arpao();
		
		arpao.setMaterial("Aço");
		arpao.setComprimento(1.2);
		arpao.setCarregado(true);
		arpao.exibirInformacoes();
		arpao.disparar();
		arpao.recarregar();
		arpao.exibirInformacoes();
		
	}


}