
class OverloadingExam {
	
	// 특정 이름을 지닌 메소드가 있다고 할지라도 우리는 같은 이름을 가진 메소드를 또 만들 수 있다.
	// 이것을 오버로딩이라고 한다.
	// 오버로딩에서 매개변수의 수가 다르거나 타입이 달라야 가능하다.
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int plus(int x, int y, int z) {
		return x + y + z;
	
	}
	
	public String plus(String x,String y) {
		return x + y;
	}
}


public class Overloading {
	
	public static void main (String[] args) {
		
		OverloadingExam o1 = new OverloadingExam();
		System.out.println(o1.plus(3,4,5));
		
	}
}
