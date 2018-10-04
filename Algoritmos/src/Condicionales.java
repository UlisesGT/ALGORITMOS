import java.util.Random;

public class Condicionales {
	
	public boolean acreditar (int asistencia, int  calificacion) {
		
		final int Tasistencia = 70;
		boolean acredita = false;
		
		if (asistencia >= (Tasistencia * 0.8) && calificacion >= 60) 
			
			acredita = true;	
		return acredita;
	}
	public float Salario (float salario, float horas) {
		
		if (horas > 40)
			salario = (float) ((40 * salario) + (horas - 40) * (salario * 1.5));
		
		else 
			salario = horas * salario;
		
		return salario;
	}
	public int Numero (int n1, int n2, int n3, int enmedio) {
		
		if (n1 < n2 && n1 > n3 || n1 > n2 && n1 < n3)
			enmedio = n1;
		if (n2 < n1 && n2 > n3 || n2 > n1 && n2 < n3) 
			enmedio = n2;
		if (n3 > n2 && n3 < n1 || n3 > n2 && n3 > n1) 
			enmedio = n3;
		return enmedio;
	}
	public String Horas (int segundo, int minuto, int hora, int incremento) {
		
		if(incremento != 0) {
			segundo += incremento;
			if(segundo > 59) {	
				minuto += segundo / 60;
				segundo = segundo % 60;
				if(minuto > 59) {
					hora += minuto / 60;
					minuto = minuto % 60;
					if(hora > 23) 
						hora = hora % 24;
				}
			}
		}return ("La Hora es -> "+hora+":"+minuto+":"+segundo);
	}
	public String Adivinar (int n1, int n2) {
		
		String pista = "";
		
		if (n1 != n2) {
			if (n2 < n1)
				pista = "Mayor";
			if (n2 > n1)
				pista = "menor";
		} else 
			pista = "Acertaste"; 
		return pista;
	}
}
