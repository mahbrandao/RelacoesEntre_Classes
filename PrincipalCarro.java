package relacoesEntre_classes;

public class PrincipalCarro {

	public static void main(String[] args) {

		Motor motor = new Motor("V8");
		Carro carro = new Carro("Mustang", motor);

		System.out.println("O carro é : " + carro.getModelo() + "\nMotor: " + motor.getTipo());

	}

}
