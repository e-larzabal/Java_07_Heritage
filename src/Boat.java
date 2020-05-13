
public class Boat extends Vehicle {

	/*
	 * constructors
	 */
	public Boat(String brand, int kilometers) {
		super(brand, kilometers);
	}

	/*
	 *  instance method
	 */
	@Override
	public String doStuff() {
		
		return "Je suis "+this.getBrand()+" et je fais glou glou !" ;	
	}
}
