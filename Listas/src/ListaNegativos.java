import java.util.Scanner;

public class ListaNegativos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numeros;
		int n;
		
		System.out.println("Quantos numeros digitar?");
		n = sc.nextInt();
		System.out.println();
		
		double[] listaNumeros = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite um número:");
			listaNumeros[i] = sc.nextDouble();
		}
		System.out.println("Numeros Negativos:");
		
		for (int i=0; i<n; i++) {
			if (listaNumeros[i] < 0) {
				System.out.printf("%d\n", listaNumeros[i]);
			}
		}
		sc.close();
	}

}
