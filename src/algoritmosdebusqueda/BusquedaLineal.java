package algoritmosdebusqueda;

public class BusquedaLineal {

	public static void main(String[] args) {

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
