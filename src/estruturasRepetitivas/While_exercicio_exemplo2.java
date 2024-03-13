package estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class While_exercicio_exemplo2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		int soma = 0;
		int count = 0;

		while (idade >= 0) {
			soma = soma + idade;
			count = count + 1;
			idade = sc.nextInt();
		}

		if (soma > 0) {
			double media = (double) soma / count;
			System.out.printf("%.2f%n", media);
		} else {
			System.out.println("impossível calcular");
		}

		sc.close();

	}

}
