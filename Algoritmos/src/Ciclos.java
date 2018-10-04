public class Ciclos {
	
	public int potencia (int base, int exponente) {
		
		int solucion = 1;
		
		for(int i = 0; i < exponente; i++) {
			
			solucion *= base;	
		}return solucion;
	}
	public int Cifras (int n1, int n2) {
		
		int cont1 = 0, cont2 = 0;
		
		if (n1 == 0)
			cont1 = 1;
		else 
			while (n1 >= 1) {
				n1 = n1 / 10;
				cont1 ++;
			}
		if (n2 == 0)
			cont2 = 1;
		else 
			while (n2 >= 1) {
				n2 = n2 / 10;
				cont2 ++;
			}
		return cont1 + cont2;	
	}
    public String Primo (int n1) {
    	
		int x = 1, i = 2;
		String resultado = "";

		while (i <= n1) {
			if (n1 % i == 0) 
				x ++;
			
			i ++;
		} if (x == 2)
			resultado = "es PRIMO";
			else 
				resultado = "NO es PRIMO";  
		return resultado;			
	}
	public String Cuadrado (int n1) {
		
		String cuadrado = "";
		
		for (int i = 0; i < n1; i++) {
			cuadrado += "\n";
			for (int j = 0; j < n1; j++)
				cuadrado += " * ";
			
		} 	return cuadrado;
	}
}
