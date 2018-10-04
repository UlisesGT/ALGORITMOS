import java.util.Random;
import java.util.Scanner;

public class Algoritmosapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ciclos ciclo = new Ciclos ();		
		Condicionales condicion = new Condicionales();
		
		Scanner leer = new Scanner (System.in);
		
		int base = 0, exponente = 0;
		int calificacion, asistencia;
		float salario, horas;
		int n1, n2, n3, enmedio = 0;
		String respuesta = "";
		/*
		//Elevar una Potencia
		System.out.println("Ingresa base: ");
		base = leer.nextInt();
		System.out.println("Ingresa exponente: ");
		exponente = leer.nextInt();	
		System.out.println("Resultado: "+ciclo.potencia(base, exponente));
		
		//Acreditar
		System.out.println("Ingrese Calificacion: ");
		calificacion = leer.nextInt();
		System.out.println("Ingrese Asistencia:");
		asistencia = leer.nextInt();
		System.out.println("Pasate: "+condicion.acreditar(asistencia, calificacion));
		
		//Salario
		System.out.println("Ingresa pago por hora: ");
		salario = leer.nextFloat();
		System.out.println("Ingresa horas laboradas: ");
		horas = leer.nextFloat();
		System.out.println("Ganancia Total: "+condicion.Salario(salario, horas));
		
		//Numero de enmedio
		System.out.println("Ingresa n1");
		n1 = leer.nextInt();
		System.out.println("Ingresa n2");
		n2 = leer.nextInt();
		System.out.println("Ingresa n2");
		n3 = leer.nextInt();
		System.out.println("Numero de enmedio: "+condicion.Numero(n1, n2, n3, enmedio));
		*/
		//Suma de cifras	
		/*System.out.println("Ingresa n1:");  ¡¡¡ TER
		n1 = leer.nextInt();                         MI
		System.out.println("Ingresa n2:");             NAR !!!
		n2 = leer.nextInt();
		System.out.println("Suma de las cifras: "+ciclo.Cifras(n1, n2));*/
		/*
		//Horas
		System.out.println("Hora");
		n1 = leer.nextInt();
		System.out.println("Minuto");
		n2 = leer.nextInt();
		System.out.println("Segundo");
		n3 = leer.nextInt();
		System.out.println("Incrementa en segundos");
		enmedio = leer.nextInt();
		System.out.println("Hora incrementada "+condicion.Horas(n3, n2, n1, enmedio));
		
		//Adivina
		Random rnd = new Random(System.nanoTime());
		n1 = rnd.nextInt(10);
		do {
			System.out.println("Adivina el numero: ");
			n2 = leer.nextInt();
			respuesta = condicion.Adivinar(n1, n2);
			System.out.println(respuesta);
			
		} while(!respuesta.equals("Acertaste"));*/
		
		//Numero Primo
			System.out.println("ingresa un numero:");
			n1 = leer.nextInt();
			System.out.println("Tu numero "+ciclo.Primo(n1));
		
		//Imprime un cuadro relleno de asteriscos
//		do{
//			System.out.println("Numero");
//		    n1 = leer.nextInt();
//		    System.out.println(ciclo.Cuadrado(n1));
//		  } while (n1 != 0);
	}

}
