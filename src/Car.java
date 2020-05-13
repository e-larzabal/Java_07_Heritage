
public class Car extends Vehicle{

	/*
	 * constructors
	 */
	public Car(String brand, int kilometers) {
		super(brand, kilometers);
		// TODO Auto-generated constructor stub
	}

	/*
	 *  instance method
	 */
	public String doStuff() {
		
		return "Je suis "+this.getBrand()+" et je fais vroum vroum !" ;
	}
}
