import java.util.Scanner;

public class exercicioAula1_2 {
	
	/*Escreva um programa Java para ler duas medidas de um retângulo. O
	programa deve mostrar o perímetro e a área do retângulo a partir das
	medidas recebidas.*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois valores inteiros com medidas de um retangulo.");
		int b = sc.nextInt();
		int h = sc.nextInt();
		int perimetro = 2*(b+h);
		int area = b*h;
		System.out.println("Perímetro do retâmgulo = "+perimetro);
		System.out.println("Área do retâmgulo = "+area);
		
		sc.close();

	}

}
