import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

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
		System.out.println("\n\tEl tamaño actual de la lista es: "+list.size());
		
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
		
		//Seria de Fibonacci
		long[] fibo = new long [n1];
		System.out.println("Ingres la cantidad de numeros que desea imprimir de la serie fibonacci: ");
		n1 = leer.nextInt();
		
		fibo = arreglo.fibonacci(n1);
		
		for (int i = 0; i < n1; i++)		
			System.out.println(i+1+".  "+fibo[i]);
		
	    //Pilas
		Stack <String> pila = new Stack<String>();
		
		pila.push("Adas");
		pila.push("Hola");
		pila.push("Adios");
		pila.push("Faro");
		
		System.out.println("Tamaño: "+pila.size());
		//muestra el elemento de la cima sin quitarlo
		System.out.println("Ultimo elemento: "+pila.peek());
		System.out.println("Tamaño: "+pila.size());
		//muestra el elemento de la cima y lo quita
		System.out.println("Ultimo elemento despues del peek: "+pila.pop());
		System.out.println("Tamaño: "+pila.size());
		System.out.println("Ultimo elemento despues del pop: "+pila.peek());
		System.out.println("Indice 1: "+pila.get(1));
		
		while (pila.size() > 0) 
			System.out.println("\t"+pila.pop());
		
		//Colas
		PriorityQueue <String> cola = new PriorityQueue <String> ();
		cola.add("carro");
		cola.add("avion");
		cola.add("comnputadora");
		cola.add("raton");
		
		Iterator it = cola.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
		
		//peek nos muestra el primer elemento de la cola
		System.out.println("\nPrimero: "+cola.peek());
		//pool nos muestra el primer elemento de la cola y lo saca de ella
		System.out.println("Primero: "+cola.poll());
		System.out.println("Nuevo primer: "+cola.peek());
		//devuelve true si contiene al elemento
		System.out.println("\n¿Contiene avion?\n"+cola.contains("comnputadora"));
		System.out.println("¿Contiene mochila?\n"+cola.contains("mochila"));
		cola.remove("raton");
		
		//TreeSet
		TreeSet <String> arbol = new TreeSet <String>();
		arbol.add("rama");
		arbol.add("camion");
		arbol.add("helicoptero");
		arbol.add("maletin");
		arbol.add("moto");
		
		System.out.println("Elementos del Árbol: "+arbol.size());
		
		Iterator it = arbol.iterator();
		while (it.hasNext())
			System.out.println("\t"+it.next());
		//No permite agregar dos veces el mismo elemento
		System.out.println("\n¿Se agrego elemento? "+arbol.add("raton"));
		System.out.println("¿Se agrego elemento? "+arbol.add("maletin"));
		System.out.println("\n\tElementos del Árbol: "+arbol.size());
		arbol.remove("moto");
		System.out.println("Despues de remove: "+arbol.size());
		arbol.clear();
		System.out.println("Despues de clear: "+arbol.size());
		
		//HashTable
		Hashtable<Integer, String> hash = new Hashtable <Integer, String>();
		//Se define la clave y el valor
		hash.put(1, "auto");
		hash.put(2, "perro");
		hash.put(3, "lap");
		//añade el ultimo elemento con el mismo numero de clave
		hash.put(3, "planta");
		//HashTable se recorre como Enumeration en lugar de Iterator
		Enumeration en = hash.keys();
		while(en.hasMoreElements()) {
			int clave = (int)en.nextElement();
			System.out.println(clave+"  "+hash.get(clave));
		}
		hash.put(4, "nuve");
		hash.put(5, "ave");
		//podemos comprobar si nuestra HashTable ya contiene esa clave
		System.out.println("\n¿Exixte la clave 3?\n"+"\t"+hash.containsKey(3));
		System.out.println("¿Existe la clave 4?\n"+"\t"+hash.containsKey(4));
		
		//TreeMap. Incluye clave por valor, y se ordena automaticamente de acuerdo a las claves
		TreeMap <String, Integer> tmap = new TreeMap<>();
		tmap.put("gato", 90);
		tmap.put("pantera", 91);
		tmap.put("mono", 10);
		tmap.put("guitarra", 80);
		
		Iterator it = tmap.keySet().iterator();
		while(it.hasNext()) {
			String clave = (String) it.next();
			System.out.println(clave+" -> "+tmap.get(clave));
		}	
		
		//Posiciones
		int posicion[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Vueltas: ");
		n1 = leer.nextInt();
		
            for (int temp : posicion) 
					System.out.print(temp+" ");
            
			for (int cont = 0; cont < n1; cont++) {

			        posicion = arreglo.posiciones(posicion);
				 
				System.out.println();
			    for (int i : posicion)
				     System.out.print(i+" ");
			}*/	
		//Archivos
		Archivo archivo = new Archivo ();
		String lorem = "";
		
		//lorem = archivo.leer("C:\\Users\\cmuli\\Documents\\JAVA Archivos\\Lectura.txt");
		lorem = archivo.cambiar("C:\\Users\\cmuli\\Documents\\JAVA Archivos\\Lectura.txt");
		System.out.println(lorem);
//		lorem = archivo.cambiar(lorem);
//		System.out.println(lorem);
//		
		//archivo.escribir("C:\\Users\\cmuli\\Documents\\JAVA Archivos\\Escritura.txt", "Probando el nuevo archivo por segunda vez");
	}
}
