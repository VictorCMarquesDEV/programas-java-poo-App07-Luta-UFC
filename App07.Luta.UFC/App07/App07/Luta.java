package App07;
import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	
	public Luta() {
		
	}


	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.aprovada = true;
			this.desafiante = l1;
			this.desafiado = l2;
			System.out.println("Luta Marcada entre " + this.getDesafiante().getNome() + " e " + this.getDesafiado().getNome() + "!");
		} else {
			this.aprovada = false;
			System.out.println("Luta não pôde ser marcada.\nAlguma regra foi violada.");
		}
	}
	public void lutar() {
		if (this.isAprovada()) {
			System.out.println("\n----- APRESENTAÇÃO DOS LUTADORES -----");
			System.out.println("DESAFIANTE:");
			this.desafiante.apresentar();
			System.out.println("DESAFIADO:");
			this.desafiado.apresentar();
			Random random = new Random();
			int vencedor = random.nextInt(3);
			switch(vencedor) {
				case 0: {
					this.desafiante.empatarLuta();;
					this.desafiado.empatarLuta();;
					System.out.println("A luta acabou empatada!");
					break;
				}
				case 1: {
					this.desafiante.ganharLuta();;
					this.desafiado.perderLuta();;
					System.out.println("O lutador " + this.desafiante.getNome() + " venceu!");
					break;
				}
				case 2: {
					this.desafiado.ganharLuta();;
					this.desafiante.perderLuta();;
					System.out.println("O lutador " + this.desafiado.getNome() + " venceu!");
					break;
				}
			}
		} else {
			System.out.println("Luta não pôde acontecer.");
		}
	}
}
