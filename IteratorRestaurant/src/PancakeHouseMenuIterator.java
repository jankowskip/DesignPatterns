import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator { // juz nie uzywana
	private ArrayList<MenuPosition> elements;
	int position;

	public PancakeHouseMenuIterator(ArrayList<MenuPosition> elements) {
		this.elements = elements;
	}

	@Override
	public boolean hasNext() {
		if (position < elements.size()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		MenuPosition menuPosition = elements.get(position);
		position = position + 1;
		return menuPosition;

	}

	public void remove(int ocena) {

	}

}
