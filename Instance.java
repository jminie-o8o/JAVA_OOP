class Car {
	public String name;
	public int number;
	
	public Car(String n) {
		name = n;
	}
 }

public class Instance {

	public static void main(String[] args) {
		Car c1 = new Car("�ҹ���");
		Car c2 = new Car("������");
		System.out.println(c1.name);

	}

}
