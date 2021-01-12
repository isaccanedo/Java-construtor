
public class Main {
	
	/*
	 * What method can be used to create a new instance of an object?
	 * Qual método pode ser usado para criar uma nova instância de um objeto?
	 * 
	 * 1 - field
	 * 2 - private method
	 * 3 - construtor ==> correct
	 * 4 - another instance 
	 * 
	 */
	
	public Main() {
		
		Main main = new Main();
		Main main2 = new Main();
		Main main3 = new Main();
		
		main3.isac();
		main.isac2();
	}

	public static void main(String[] args) {

		isac();
		isac2();
		
	}

	private static void isac2() {
		System.out.println("Método Isac 3");
		
	}

	private static void isac() {

		System.out.println("Método Isac");
		
	}

}
