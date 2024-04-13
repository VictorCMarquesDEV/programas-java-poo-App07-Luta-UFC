package App07;

public class Master {

	public static void main(String[] args) {
		Lutador n1 = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		Lutador n2 = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		//Lutador n3 = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		//Lutador n4 = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
		//Lutador n5 = new Lutador("Ufocobol", "Brasil", 37, 1.7f, 119.3f, 5, 4, 3);
		//Lutador n6 = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
		
		Luta l1 = new Luta();
		l1.marcarLuta(n1, n2);
		l1.lutar();
	}
}
