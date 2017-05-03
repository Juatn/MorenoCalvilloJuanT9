package Main;

import java.util.ArrayList;
import Exceptions.ElementNotAllowedException;
import Exceptions.ListSizeOverflownException;
import Models.ListaOrdenada;

public class prueba {

	public static void main(String[] args) {

		ArrayList<Integer> p = new ListaOrdenada<Integer>();

		// añado unos pocos numeros
		p.add(6);
		p.add(10);
		p.add(10);
		p.add(40);
		p.add(44);
		p.add(500);
		p.add(300);
		p.add(1);

		// se ordena descendentemente
		System.out.println(p);

		for (int i = 0; i < 92; i++) {
			p.add(i);
		}
		// relleno 100 numeros( el maximo de capacidad), y los imprimo
		System.out.println(p);
		// ahora añado uno mas, deberia de petar

		try {
			p.add(4);
		} catch (ListSizeOverflownException e) {

			System.out.println("No admite mas de 100");
		
		// voy a probar a meter nulls

		try {
			p.add(null);
			
		} catch (ElementNotAllowedException e1) {

			System.out.println("No admite nulls");
		}
		
	
}
}
}
