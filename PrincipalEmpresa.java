package relacoesEntre_classes;

public class PrincipalEmpresa {

	public static void main(String[] args) {

		Departamento departamento = new Departamento("administração");
		Empresa empresa = new Empresa("JKS", departamento);

		System.out.println("A empresa " + empresa.getNome() + " possui o departamento " + departamento.getNome());

	}

}
