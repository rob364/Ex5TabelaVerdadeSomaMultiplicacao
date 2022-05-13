import java.util.Scanner;

public class Ex5TabelaVerdadeSomaMultiplicacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ID1, ID2;
		int Q1, Q2;
		double VPECAS1, VPECAS2;
		double TOTAL;
		
		ID1 = sc.nextInt();
		Q1 = sc.nextInt();
		VPECAS1 = sc.nextDouble();
		
		ID2 = sc.nextInt();
		Q2 = sc.nextInt();
		VPECAS2 = sc.nextDouble();
		
		TOTAL = (VPECAS1*Q1) + (VPECAS2*Q2);
		
		System.out.printf("Valor a pagar: R$ %.2f%n", TOTAL);
		
		sc.close();
		
		
		
		

	}

}
