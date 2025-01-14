package registro_tarefas;

public class Tarefa {

	private int id;
    private String descricao;
    private int prazo;
    private boolean finalizada;

 
    public Tarefa(int id, String descricao, int prazo, boolean finalizada) {
        this.id = id;
        this.descricao = descricao;
        this.prazo = prazo;
        this.finalizada = finalizada;
    }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getPrazo() {
		return prazo;
	}


	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}


	public boolean isFinalizada() {
		return finalizada;
	}


	public void setFinalizada(boolean finalizada) {
		this.finalizada = finalizada;
	}
	  public String exibirInformacoes() {
	        return String.format("Tarefa ID: %d, Descrição: %s, Prazo: %d dias, Finalizada: %b",
	                             id, descricao, prazo, finalizada);
	    }

	    
	    public static void main(String[] args) {
	        Tarefa tarefa1 = new Tarefa(1, "Estudar JDBC", 7, false);
	        System.out.println(tarefa1.exibirInformacoes());
	    }
}