import java.util.Scanner;

public class exercicioAula1_6 {
	
	/*(for) Escreva um programa Java para imprimir na tela todos os números
	ímpares de 299 a 101 em ordem decrescente.*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 300; i > 100; i--) {
			if (i%2==1) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
