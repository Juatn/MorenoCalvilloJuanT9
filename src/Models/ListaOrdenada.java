package Models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import Exceptions.ElementNotAllowedException;
import Exceptions.ListSizeOverflownException;

public class ListaOrdenada<E> extends ArrayList<E> {

	// ATRIBUTOS

	private Comparator<E> comp;
	private final int MAX = 100;

	// CONSTRUCTOR
	public ListaOrdenada() {
		super();
		comp = Collections.reverseOrder();

	}

	// METODOS SOBREESCRITOS
	/*
	 * El mismo add que ArrayList pero limitado a 100 elementos y no acepta
	 * nulls
	 */
	@Override
	public boolean add(E element) throws ElementNotAllowedException, ListSizeOverflownException {

		if (element != null) {
			if (this.size() < MAX) {
				Collections.sort(this, comp);
				return super.add(element);
			} else {
				throw new ListSizeOverflownException("La cola está llena!");
			}
		} else {
			throw new ElementNotAllowedException("No acepto valores null!");
		}
	}

	/*
	 * El mismo add que ArrayList pero limitado a 100 elementos y no acepta
	 * nulls
	 */
	@Override
	public boolean addAll(Collection<? extends E> collection)
			throws ElementNotAllowedException, ListSizeOverflownException {
		if (collection.size() + this.size() < MAX) {
			Collections.sort(this, comp);
			return super.addAll(collection);

		} else {
			throw new ListSizeOverflownException("La cola está llena!");
		}

	}

	/*
	 * Remove ordenado
	 */
	public boolean remove(Collection<E> element) {

		Collections.sort(this, comp);

		return super.remove(element);

	}

	public void reverse(Collection<E> element) {

		Collections.reverse(this);

		return;

	}

}
