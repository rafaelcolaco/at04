package at04;
import java.util.Scanner;
public class ex07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor inteiro");
		int valor1 = input.nextInt();
		System.out.print("Digite outro valor inteiro");
		int valor2 = input.nextInt();
		input.close();
		for (int i = valor1 + 1; i < valor2; i++) {
		System.out.print(i + " | ");
		}
	}

}
