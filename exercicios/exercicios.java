import java.util.Scanner;
public class exercicios{
	public static void main(String[] args){
		int numero , sucessor, anterior;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número: ");
		numero = entrada.nextInt();
		sucessor = numero + 1;
		anterior = numero - 1;
		System.out.println("sucessor: " + sucessor );
		System.out.println("anterior: " + anterior);
	}

}