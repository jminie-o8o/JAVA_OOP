
public class super2 extends super1 {
	public void run() {
		super.run(); //이렇게 하면 오버라이딩을 하더라도 부모메소드도 실행된다.
		System.out.println("super2의!!! run 메소드");
	}
}
