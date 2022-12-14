package algoritmosdebusqueda;

import java.util.Scanner;

public class BusquedaLineal {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		System.out.print("Tamaño de arreglo: ");
		int n = lector.nextInt();
		
		int A[] = new int[n];
		
		System.out.println("Ingrese los elementos del arreglo: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Elemento [" + i + "] =");
			A[i] = lector.nextInt();
		}
		
		System.out.print("Elemento a buscar en el arreglo: ");
		int buscado = lector.nextInt();
		
		int resultado = BusquedaLinealDeEntero(A,A.length,buscado);
		
		if (resultado != -1) {
			System.out.println("El elemento " + buscado + " esta en la posicion " + resultado);
		} else {
			System.out.println("El elemento " + buscado + " no se encontro en el arreglo.");
		}
		lector.close();
		
	}
	
	private static int BusquedaLinealDeEntero(int A[], int n, int buscado) {
		int i = 0;
		while(i < A.length) {
			if (A[i] == buscado) {
				return i;
			}
			i++;
		}
		return -1;
	}

}
