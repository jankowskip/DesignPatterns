import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class Start {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");

		Enumeration enu = Collections.enumeration(list);
		Iterator iterator = new EnumerationIterator(enu);
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
