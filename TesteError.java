

public class TesteError {
	public static void main(String[] args) {
	    System.out.println("Inicio do programa");
	    try {
	        metodo();
	    } catch(ArithmeticException | NullPointerException ex) {
	        System.out.println("Deu erro");
	    }
	    System.out.println("Fim do programa");
	    
	}

	
	private static void metodo() {
	    System.out.println("Inicio da funcao que dara errro");
	    for(int i = 1; i <= 5; i++) {
	        System.out.println(i);
	        int a = i / 0; //erro esta aqui , vai quebrar aqui 
	    }
	    System.out.println("Fim da funcao que da erro"); //nunca vai chegar aqui
	    
	}
}