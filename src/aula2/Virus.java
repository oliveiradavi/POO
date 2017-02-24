/**
 * Out of memory error
 */


package aula2;

public class Virus {

	private long[][] matriz = new long[10000][10000];
	private Virus v;

	public Virus novaInstancia() {
		v = new Virus();
		return v;
	}

	public static void main(String[] args) {
		Virus raiz = new Virus();
		Virus ultimo = raiz;
		
		int cont = 0;
		
		while(true) {
			ultimo = ultimo.novaInstancia();
			System.out.printf("Instancias criadas: %d\n",cont++);
		}

		
	}
}
