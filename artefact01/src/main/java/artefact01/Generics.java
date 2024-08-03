package artefact01;

import java.util.Hashtable;

public class Generics<T, G> {
 
	T genericT;
	G genericG;
	
	Generics(T obj1 , G obj2){
		this.genericG =obj2;
		this.genericT =obj1;
		
	}
	
	public static void main(String[] array) {
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		Generics<String, Integer> genericObject = 
				new Generics<String, Integer>("test",10);
		System.out.println("Value of T --"+ genericObject.genericT.hashCode());
		System.out.println("Value of G --"+ genericObject.genericG);
	}
}

