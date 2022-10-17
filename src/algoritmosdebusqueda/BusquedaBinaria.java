package algoritmosdebusqueda;

import java.util.Scanner;

public class BusquedaBinaria {

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
		
		int resultado = BusquedaBinariaDeEntero(A,A.length,buscado);
		
		if (resultado != -1) {
			System.out.println("El elemento " + buscado + " esta en la posicion " + resultado);
		} else {
			System.out.println("El elemento " + buscado + " no se encontro en el arreglo.");
		}
		lector.close();
		
	}
	
	private static int BusquedaBinariaDeEntero(int A[], int n, int buscado) {
		int i_izq = 0;
		int i_der = n - 1;
		while(i_izq <= i_der) {
			int i_medio = Math.round((i_izq + i_der)/2);
			if (A[i_medio] == buscado) {
				return i_medio;
			} else if (A[i_medio] > buscado) {
				i_der = i_medio - 1;
			} else if (A[i_medio] < buscado) {
				i_izq = i_medio + 1;
			}			
		}
		return -1;
	}

}
