class Train{
	public void run() {
		System.out.println("달리다");
	}
}
// taxi는 Train을 상속받음. Train 클래스의 메소드를 사용가능.
class taxi extends Train{
	public void pangpang() {
		System.out.println("빵빵");
	}
}
public class Bus{
	public static void main(String[] args) {
		taxi t1 = new taxi();
		taxi t2 = new taxi();
		t1.run();
		t2.pangpang();
		
		
	}
}
