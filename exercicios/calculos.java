import java.util.Scanner;
public class calculos{
	public static void main(String[] args){
		int numero1 , numero2;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número: ");
		numero1 = entrada.nextInt();
		System.out.print("Informe um número: ");
		numero2 = entrada.nextInt();
		int soma = numero1 + numero2;
		int subtracao = numero1 - numero2;
		int multiplicaçao = numero1 * numero2;
		int divisao = numero1 / numero2;
		System.out.println("soma: " + soma );
		System.out.println("subtracao: " + subtracao);
		System.out.println("multiplicaçao: " + multiplicaçao );
		System.out.println("divisao: " + divisao);
	}
}