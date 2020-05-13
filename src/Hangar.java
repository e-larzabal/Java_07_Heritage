
public class Hangar {

	public static void main(String[] args) {
		Vehicle[] parc = new Vehicle[4];
		
		parc[0] = new Car("Peugeot 407",450001);
		parc[1] = new Car("Renault clio",450002);
		parc[2] = new Boat("Bombard",1852459);
		parc[3] = new Boat("Beneteau",1852459);
						
		for (int i=0;i<parc.length;i++) {
			System.out.println(parc[i].doStuff());
		}
	}

}
