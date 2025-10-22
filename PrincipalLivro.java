package relacoesEntre_classes;

public class PrincipalLivro {

	public static void main(String[] args) {
		
		Livro livro = new Livro("Malibu Renasce", "Taylor Jenkins Reid");
		System.out.println(livro.getTitulo() + " foi feito pela autora " + livro.getAutor() );

	}

}
