package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, num1, cod2, num2;  
		double preco1, preco2, total; 
		
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		total = num1 * preco1 + num2 * preco2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}
