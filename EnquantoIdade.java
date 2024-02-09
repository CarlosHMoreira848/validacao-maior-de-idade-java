import java.util.Scanner;
public class EnquantoIdade {
	public static void main(String[] args) {
		int idade = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bem vindo ao programa!");
		while(idade < 18) {
			System.out.println("Para continuar você precisa digitar sua idade: ");
			idade = entrada.nextInt();
			if(idade < 18) {
				System.out.println("Você é menor de idade! Infelizmente não poderá usar nosso sistema!...");
			}
		}
		System.out.println("Você é maior de idade! Pode utilizar nosso sistema!...");
	}
}
