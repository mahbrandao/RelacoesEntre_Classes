package relacoesEntre_classes;

public class PrincipalUniversidade {

	public static void main(String[] args) {

		Universidade universidade = new Universidade(" USP");
		Estudante estudante = new Estudante("Duda", universidade);
		System.out.println("Estudante: " + estudante.getNome() + "\nUniversidade" + universidade.getNome());
	}

}
