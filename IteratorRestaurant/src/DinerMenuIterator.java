import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
	MenuPosition[] elements;
	int position;

	public DinerMenuIterator(MenuPosition[] elements) {
		this.elements = elements;
	}

	public boolean hasNext() {
		if (position >= elements.length || elements[position] == null) {
			position = 0;
			return false;
		} else {
			return true;
		}
	}

	public Object next() {
		MenuPosition menuPosition = elements[position];
		position = position + 1;
		return menuPosition;
	}

	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException("you cant remove before next");
		}
		if (elements[position - 1] != null) {
			for (int i = position - 1; i < (elements.length - 1); i++) {
				elements[i] = elements[i + 1];
			}
			elements[elements.length - 1] = null;

		}
	}

}
