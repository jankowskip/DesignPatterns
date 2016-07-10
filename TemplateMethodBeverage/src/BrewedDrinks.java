
public abstract class BrewedDrinks {

	public final void recipe() {
		boilingWater();
		brewing();
		pouringIntoCup();
		if (wannaThings()) {
			addThings();
		}
	}

	abstract void brewing();

	abstract void addThings();

	void boilingWater() {
		System.out.println("Boiling Water");
	}

	public void pouringIntoCup() {
		System.out.println("Pouring into cup");
	}

	public boolean wannaThings() { // hook
		return true;
	}

}
