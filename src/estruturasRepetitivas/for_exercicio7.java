package estruturasRepetitivas;

import java.util.Scanner;

public class for_exercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			int quadrado = i * i;
			int cubo = i * i * i;
			System.out.println(i + " " + quadrado + " " + cubo);
		}
		sc.close();
	}
}
