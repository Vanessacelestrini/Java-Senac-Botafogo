package mergulho;

public class Arpao {
	
	//Aqui são os atributos
	private String material;
	private double comprimento;
	private boolean carregado;
	
	// Gets e setters
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public boolean isCarregado() {
		return carregado;
	}
	public void setCarregado(boolean carregado) {
		this.carregado = carregado;
	}
	
	// informaçoes
	
	public void disparar() {
		if (carregado) {
			System.out.println("O arpão foi disparado");
			carregado = false;
			}
		else {
			System.out.println("O arpão não está carregado. Recarregue");
		}
	}
	public void recarregar() {
		System.out.println(carregado ? "O arpão já está carregado." : "O arpão foi carregado.");
		carregado = true;
	}
	public void exibirInformacoes() {
		System.out.printf("Material: %s\ncomprimento: %.2f metros\nEstá carregado; %s\n", material, comprimento, carregado ? "sim" : "não");
	}
 }