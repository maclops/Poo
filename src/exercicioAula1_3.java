import java.util.Locale;
import java.util.Scanner;

public class exercicioAula1_3 {
	
	/*Escreva um programa Java para ler os valores de quatro números N1, N2,
	N3 e N4. Calcule e imprima o valor da média aritmética dos mesmos.*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		System.out.println("Digite quatro valores, irei calcular a média aritimética deles.");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		double media = (n1+n2+n3+n4)/4;
		System.out.printf("A média aritimética é = %.2f",media);
		
		sc.close();

	}

}