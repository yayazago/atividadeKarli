import java.util.Scanner;

public class Metros{
	
	public static void main(String[] args){
		double metros;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a medida em metros: ");
		metros = entrada.nextDouble();
		double centimetros = metros * 100;
		System.out.println("centimetros: " + centimetros );
		
	}
}