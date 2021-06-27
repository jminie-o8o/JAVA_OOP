class Car {
	public String name;
	public int number;
	
	public Car(String n) {
		name = n;
	}
 }

public class Instance {

	public static void main(String[] args) {
		Car c1 = new Car("소방차");
		Car c2 = new Car("구급차");
		System.out.println(c1.name);

	}

}
