package polimorfismo;

import java.util.LinkedList;

public class Teste {

	public static void main(String[] args) {
		Cavalo c1 = new Cavalo();
		Homem h1 = new Homem();
		Morcego m1 = new Morcego();

		LinkedList<Animal> animais = new LinkedList<Animal>();

		animais.add(c1);
		animais.add(h1);
		animais.add(m1);

		for (Animal a : animais) {
			a.dormir();
		}
	}
}
