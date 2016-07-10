import java.util.Iterator;
import java.util.Stack;

public class IteratorNull implements Iterator {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Object next() {
		return null;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

}
