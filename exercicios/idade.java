import java.util.Scanner;
public class idade{
	public static void main(String[] args){
		int idade;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe sua idade: ");
		idade = entrada.nextInt();
		int idadeemdias = idade * 365;
		System.out.println("idade em dias: " + idadeemdias );
	}
}