package Exceptions;

public class ListSizeOverflownException extends NullPointerException {

	public ListSizeOverflownException(String msg) {
		super("[ERROR]"+msg);
	}

}
