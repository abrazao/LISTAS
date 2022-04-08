package Listas;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, qtNegativos;
		qtNegativos = 0;
		System.out.print("Digite o tamanho da matriz:");
		n = sc.nextInt();
		System.out.println("============================");
		int [][] Matriz = new int [n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				Matriz[i][j] = sc.nextInt();			
			}
		}
		System.out.println("Diagonal Principal:");
		System.out.println("-------------------");
		
		for (int i=0; i<n; i++) {
			System.out.printf("%d ", Matriz[i][i]);
		}
		System.out.println("Números Negativos:");
		System.out.println("-----------------");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (Matriz[i][j] < 0) {
					qtNegativos++;
				}
							
			}
		}
		System.out.printf("\nQUANTIDADE DE NEGATIVOS = %d\n", qtNegativos);
		sc.close();
	}
}
