package model;

public class App {

	public static void main(String[] args) {
		Tarefa exemplo = new Tarefa();
		Tarefa exemplo02 = new Tarefa();
		Tarefa exemplo03 = new Tarefa();
		Tarefa exemplo04 = new Tarefa();
		Tarefa exemplo05 = new Tarefa();
		Tarefa exemplo06 = new Tarefa();
		Tarefa exemplo07 = new Tarefa();
		Tarefa exemplo08 = new Tarefa();
		Tarefa exemplo09 = new Tarefa();
		Tarefa exemplo10 = new Tarefa();
	
		
		exemplo.setId(1);
		exemplo.setDescricao("Comprar batata");
		exemplo.setPrazo(1);
		exemplo.setFinalizada(false);
		
		exemplo02.setId(1);
		exemplo02.setDescricao("Fazer faxina");
		exemplo02.setPrazo(1);
		exemplo02.setFinalizada(false);
		
		exemplo03.setId(1);
		exemplo03.setDescricao("Comprar comida para o gato");
		exemplo03.setPrazo(1);
		exemplo03.setFinalizada(false);
		
		exemplo04.setId(1);
		exemplo04.setDescricao("Ir a academia");
		exemplo04.setPrazo(1);
		exemplo04.setFinalizada(false);
		
		exemplo05.setId(1);
		exemplo05.setDescricao("Ir ao mercado");
		exemplo05.setPrazo(1);
		exemplo05.setFinalizada(false);
		
		
		exemplo06.setId(1);
		exemplo06.setDescricao("Fazer comida");
		exemplo06.setPrazo(1);
		exemplo06.setFinalizada(false);
		
		
		exemplo07.setId(1);
		exemplo07.setDescricao("Ir ao médico");
		exemplo07.setPrazo(1);
		exemplo07.setFinalizada(false);
		
		
		exemplo08.setId(1);
		exemplo08.setDescricao("Comprar frutas");
		exemplo08.setPrazo(1);
		exemplo08.setFinalizada(false);
		
		
		exemplo09.setId(1);
		exemplo09.setDescricao("Comprar Coca-cola");
		exemplo09.setPrazo(1);
		exemplo09.setFinalizada(false);
		
		
		exemplo10.setId(1);
		exemplo10.setDescricao("Estudar Java");
		exemplo10.setPrazo(1);
		exemplo10.setFinalizada(false);
		
		//imprimir os exemplos coms todas as informacoes
		System.out.println("Tarefa: " + exemplo09.getId() + " - " +
 				           exemplo09.getDescricao() + " - " +
				           exemplo09.getPrazo()+ " - " +
		                   exemplo09.isFinalizada());
		
		
		
		
		System.out.println(exemplo02.getDescricao());
		
		System.out.println(exemplo03.getDescricao());
		
		System.out.println(exemplo04.getDescricao());
				
		
	}
}
