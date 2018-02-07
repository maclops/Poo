import java.util.Scanner;

public class exercicioAula1_5 {
	
	/*(while) Escreva um programa Java capaz de mostrar na tela do
	computador a seqüência de números de 1 a 100.*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		
		while (i <= 100) {
			System.out.println(i);
			i++;
		}
		
		sc.close();

	}

}
