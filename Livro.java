package relacoesEntre_classes;

public class Livro {

	private String titulo;
	private Autor autor; // Composicao

	// Construtor
	public Livro(String titulo, String nomeAutor) {
		this.titulo = titulo;
		this.autor = new Autor(nomeAutor);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor.getNome();
	}

}
