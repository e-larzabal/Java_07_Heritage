
public class Hangar {

	public static void main(String[] args) {
		/*Vehicle[] parc = new Vehicle[4];
		
		parc[0] = new Car("Peugeot 407",450001);
		parc[1] = new Car("Renault clio",450002);
		parc[2] = new Boat("Bombard",1852459);
		parc[3] = new Boat("Beneteau",1852459);
						
		for (int i=0;i<=3;i++) {
			System.out.println(parc[i].doStuff());
		}*/
		
		   Car karl = new Car("Karl",0);
	       // karl.setKilometers(76);

	        System.out.println("1. Car brand is:" + karl.getBrand());
	        System.out.println("2. She has " + (karl.getKilometers() + "km"));
	        System.out.println(karl.doStuff());

	        Boat yacht = new Boat("Yacht",0);
	        System.out.println(yacht.doStuff());
	}

}
