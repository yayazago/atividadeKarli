import java.util.Scanner;
public class media{
	public static void main(String[] args){
		double nota1 , nota2 , nota3;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a nota: ");
		nota1 = entrada.nextDouble();
		System.out.print("Informe a nota: ");
		nota2 = entrada.nextDouble();
		System.out.print("Informe a nota: ");
		nota3 = entrada.nextDouble();
		
		double media = (nota1 + nota2 + nota3) /3;
		System.out.println("media: " + media );
	}
}