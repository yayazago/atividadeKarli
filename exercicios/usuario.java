import java.util.Scanner;
public class usuario{
	public static void main(String[] args){
		String nome;
		int idade;
		boolean ativa;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe seu nome: ");
		nome = entrada.nextLine();
		System.out.print("Informe sua idade: ");
		idade = entrada.nextInt();
		System.out.print("Informe se sua conta esta ativa(true ou false): ");
		ativa = entrada.nextBoolean();
		
		System.out.println("nome: " + nome );
		System.out.println("idade: " + idade );
		System.out.println("conta ativa: " + ativa );
	}
}