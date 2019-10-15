package inher;

class vechicle {

	protected String brand = "Ford";

	public void abc() {
		System.out.println("print ");
	}
}

class motorcycle {
	public void xyz() {
		System.out.println("2nd print");
	}
}

public class inheri extends vechicle {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		vechicle car = new vechicle();
		car.abc();
		motorcycle m = new motorcycle();
		m.xyz();

	}

}