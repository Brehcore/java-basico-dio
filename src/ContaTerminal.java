import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String nomeDoCliente = "Brena Soares";
		double saldo = 5000.00;
		
		System.out.println("Digite o número da da sua Conta: ");
		int numeroConta = sc.nextInt();
		
		System.out.println("Digite o númeroda agência: ");
		String numeroAgencia = sc.next();
		
		System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, "
				+ "sua Agência é " + numeroAgencia + " e sua Conta " + numeroConta + ", o seu saldo é R$" + saldo 
				+ " já está disponível para saque.");
		
	}

}
