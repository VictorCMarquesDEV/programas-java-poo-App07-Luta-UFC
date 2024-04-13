package App07;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	
	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
		this.setNome(no);
		this.setNacionalidade(na);
		this.setIdade(id);
		this.setAltura(al);
		this.setPeso(pe);
		this.setVitorias(vi);
		this.setDerrotas(de);
		this.setEmpates(em);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria() {
		if (this.getPeso() < 52.2) {
			categoria = "Inválido";
		} else if (this.getPeso() <= 70.3) {
			categoria = "Leve";
		} else if (this.getPeso() <= 83.9){
			categoria = "Médio";
		} else if (this.getPeso() <= 120.2){
			categoria = "Pesado";
		} else {
			categoria = "Inválido";
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias += vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas += derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates += empates;
	}
	
	
	public void apresentar() {
		System.out.println("Nome: " + this.getNome() + " (" + this.getIdade() + ")");
		System.out.println("País: " + this.getNacionalidade());
		System.out.println("Altura: " + this.getAltura() + "m | Peso: " + this.getPeso() + "kg | Categoria: " + this.getCategoria());
		System.out.println("Histórico do Atleta: " + this.getVitorias() + "V | " + this.getDerrotas() + "D | " + this.getEmpates() + "E\n");
	}
	public void ganharLuta() {
		this.setVitorias(1);
	}
	public void perderLuta() {
		this.setDerrotas(1);
	}
	public void empatarLuta() {
		this.setEmpates(1);
	}
}
