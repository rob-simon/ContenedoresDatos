package principal;
import java.util.ArrayList;
import java.util.Iterator;

import estructures.Coa;
import estructures.Element;
import estructures.Pila;
import estructures.PilaString;

public class Proves {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Element j=new Element("Roberto", null);
//		
//		Element k=new Element("Hola",j);
//		
//		Element actual=k;
//		while(actual!=null){
//			System.out.println(actual);
//			actual=actual.getSeg();
//		}
//		System.out.println();
//		Pila p=new Pila();
//		p.push("Roberto");
//		p.push("Pep");
//		p.push("Toni");
//		p.push("Jesús");
//		p.push("Iván");
//		p.push("Pape");
//		p.push("Joan");
//		
//		System.out.println(p.peek()+"\n");
//		
//		/**
//		 * Mostramos y eliminamos la información.
//		 */
//		while(!p.empty()){
//			System.out.println(p.poll());
//		}
//		System.out.println("\n"+p.poll());
		
//		Element<String> prova=new Element<String>("prova", null);
//		Element<Carta> prova2=new Element<Carta>(new Carta("oros","cavall"), null);
//
//		Pila<Carta> p=new Pila<Carta>();
//		p.push(new Carta("oros","cavall"));
//		p.push(new Carta("espases","8"));
//		p.push(new Carta("oros","2"));
//		p.push(new Carta("oros","rei"));
//		p.push(new Carta("bastos","5"));
//		p.push(new Carta("bastos","3"));
//		p.push(new Carta("espases","cavall"));
//		
//		/**
//		 * Mostramos y eliminamos la información.
//		 */
//		while(!p.empty()){
//			System.out.println(p.poll());
//		}
		
//		Coa c=new Coa();
//		c.add("Roberto");
//		c.add("Pep");
//		c.add("Toni");
//		
//		System.out.println(c.size());
//		
//		while(!c.empty()){
//			System.out.println(c.remove());
//		}
//		
//		c.add("Joan");
//		System.out.println("\n"+c.element());
		
		ArrayList<String> prova=new ArrayList<String>();
		
		
		//Añadimos los elementos a la lista.
		prova.add("Pep");
		prova.add("Iván");
		prova.add("Joan");
		prova.add("Pape");
		prova.add("Jesus");
		
		//Recorremos la lista para que nos muestre el contenido usando el Iterator.
		//Con el hasNext() sabemos si la lista tiene información y con el next() nos muestra la información de siguiente.
		System.out.println("Elementos de la lista:");
		Iterator<String> it=prova.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		prova.add(4, "Roberto");
		
		//Le pedimos que nos muetre el elemento de la posición 5.
		System.out.println("\nElemento de la posición 5:\n"+prova.get(5));
		
		
		//Nos indica si el elemento que llamamos está en la lista(true).
		System.out.println("\nCoincide: "+prova.contains("Roberto"));
		
		//Le pedimos que nos indique el tamaño de la lista.
		System.out.println("Tamaño de la lista: "+prova.size());
		
		//Eliminamos el elemento que está en la posición 3.
		prova.remove(3);
		System.out.println("Tamaño de la lista2: "+prova.size());
		
		//Sustituimos el elemento de la posición 4 por otro elemento.
		System.out.println("\nElementos de la lista modificada:");
		prova.set(4, "Jesús");
		for(String i:prova){
			System.out.println(i);
		}
		
		//Meteremos la lista dentro de un Array usando el toArray.
		String[] l=new String[prova.size()];
		prova.toArray(l);
		System.out.println("\nLista con el toArray:");
		for(String s:l){
			System.out.println(s);
		}


	}

}
