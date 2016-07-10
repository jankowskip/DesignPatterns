import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffe extends BrewedDrinks {

	@Override
	void brewing() {
		System.out.println("Coffe brewing");

	}

	@Override
	void addThings() {
		System.out.println("Add sugar and milk");

	}

	public boolean wannaThings() { // hook
		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		String answer = null;
		System.out.println("Wanna sugar and milk in cofe? (y/n) ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (answer == null) {
			return "no";
		}
		return answer;

	}

}
