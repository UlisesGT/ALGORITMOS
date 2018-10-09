import java.util.ArrayList; 
import java.util.Iterator;
import java.util.Random;
import java.util.Stack;

public class Arreglos {
	
	public String[] Año (int[] n1) {
		
		int aux = 0;
		String[] meses = new String [n1.length];
		String[] prueba = {"jaja","Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		for (int i = 0; i < n1.length; i++) {
			
			aux = n1[i];
			meses[i] = prueba[aux];		
			
	        } return meses;
	}
	public int[] Suma (int[] n1, int[] n2) {
		
		int[] aleatorio = new int [n1.length];
		
		for (int i = 0; i < n1.length; i++) {
			aleatorio [i] = n1[i] + n2[i];

		} return aleatorio;		
	}
	public int promedio (ArrayList numeros) {
		
		int prom = 0;
		Iterator it = numeros.iterator();
		while(it.hasNext()) {
			prom += (int)it.next();
		} 
		prom = prom/numeros.size();
		return prom;
	}
	public long[] fibonacci (int x) {
		
		long n1 = 0, n2 = 1, n3 = 0;
		long[] fibo = new long[x];
		
		for (int i = 0; i < x; i++){

			n3 = n1 + n2;
			n2 = n1;
			n1 = n3;
			
			fibo[i] = n2;
		} return fibo;
	}
	public int[] posiciones (int[] posicion1) {
		
		int[] posicion = new int[10];
		
		posicion[0] = posicion1[9];
		for (int i = 1; i < posicion.length; i++) {
			
			posicion[i] = posicion1[i - 1];
			posicion[0] = posicion1[posicion1.length - 1];
		} 
		return posicion;
	}
	
}
