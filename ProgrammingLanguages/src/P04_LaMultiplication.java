import java.util.Scanner;

public class P04_LaMultiplication {

	public static void main(String[] args) {

		// ferme le lecteur
		Scanner in = new Scanner(System.in);
		
		// lit les nombres.
		System.out.printf("Enter first number:  ");
		int num1 = in.nextInt();
		System.out.printf("Enter second number:  ");
		int num2 = in.nextInt();

		// ça fait le calcul
		int result = num1 * num2;

		// affiche le resultat
		System.out.println("result is = " + result);

		// ferme le lecteur
		in.close();
	}

}
