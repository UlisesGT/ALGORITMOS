import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Algoritmosapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ciclos ciclo = new Ciclos ();		
		Condicionales condicion = new Condicionales();
		Arreglos arreglo = new Arreglos ();
		
		Scanner leer = new Scanner (System.in);
		
		int base = 0, exponente = 0;
		int calificacion, asistencia;
		float salario, horas;
		int n1 = 0, n2, n3, enmedio = 0;
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
			
		} while(!respuesta.equals("Acertaste"));
		
		//Numero Primo
			System.out.println("ingresa un numero:");
			n1 = leer.nextInt();
			System.out.println("Tu numero "+ciclo.Primo(n1));
		
		Imprime un cuadro relleno de asteriscos
		do{
			System.out.println("Numero");
		    n1 = leer.nextInt();
		    System.out.println(ciclo.Cuadrado(n1));
		  } while (n1 != 0);
		
		//Arreglo
		
		Random rnd = new Random(System.nanoTime());
		int[] aleatorio = new int [12];
		String[] meses = new String [12];
		
		for (int i = 0; i < meses.length; i++) {
			
			aleatorio[i] = rnd.nextInt(12);
			meses = arreglo.Año(aleatorio);
		} 
		for (String temp : meses) {
			
			System.out.println(temp);
		}
		
		//Suma de arreglos
		System.out.println("Ingrasa el tamaño del arreglo: ");
		n1 = leer.nextInt();
		Random rnd = new Random(System.nanoTime());
		
		int[] aleatorio = new int [n1];
		int[] aleatorio1 = new int [n1];
		int[] aleatorio0 = new int [n1];
		
		
    	for (int i = 0; i < aleatorio.length; i++) {
			
		    aleatorio[i] = rnd.nextInt(100);
		    aleatorio1[i] = rnd.nextInt(100);		    
		} 
			aleatorio0 = arreglo.Suma(aleatorio, aleatorio1);
        for (int i = 0; i < n1; i++) {
		    System.out.println("Posición "+i+":  "+aleatorio[i]+" + "+aleatorio1[i]+" = "+aleatorio0[i]);
	    }
		
		//ArrayList
		ArrayList list = new ArrayList();
		list.add("GTX"); //Agregamos al array
		list.add(1230);
		list.add('U');
		list.add(ciclo);
		list.add(true);
		
		list.remove(ciclo);//Removemos del array
		
		//Verificamos si contiene algun elemento
		System.out.println("La lista contiene a GTX: "+list.contains("GTX"));
		System.out.println("La lista contiene a TERS: "+list.contains("TERS"));
		
		Iterator it = list.iterator();//Creamos un iterador para recorer la lista
		
		System.out.println("\n\tLa lista contiene: ");
		while(it.hasNext()) { //El Ciclo se efectua mientra alla elementos en la lista
			System.out.println("\t\t\t"+it.next());
		}
		System.out.println("\n\tEl tamaño actual de la lista es: "+list.size());*/
		
		//Ejercicio ArraList
		ArrayList<Integer> list = new ArrayList<Integer>();
		do {
			System.out.println("Ingresa valores al arreglo: ");
			n1 = leer.nextInt();
			if (n1 >= 0)
			    list.add(n1);			
		}while(n1 >= 0);
		n1 = arreglo.promedio(list);
		System.out.println("PROMEDIO: "+n1);
	}
}
