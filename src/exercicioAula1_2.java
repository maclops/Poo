import java.util.Scanner;

public class exercicioAula1_2 {
	
	/*Escreva um programa Java para ler duas medidas de um ret�ngulo. O
	programa deve mostrar o per�metro e a �rea do ret�ngulo a partir das
	medidas recebidas.*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois valores inteiros com medidas de um retangulo.");
		int b = sc.nextInt();
		int h = sc.nextInt();
		int perimetro = 2*(b+h);
		int area = b*h;
		System.out.println("Per�metro do ret�mgulo = "+perimetro);
		System.out.println("�rea do ret�mgulo = "+area);
		
		sc.close();

	}

}
