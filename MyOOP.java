//Print라는 클래스 안에 delimiter, A, B라는 메소드를 넣었더니 연관되어 있다는 사실을 훨씬 알기 쉽다.
//하나의 자바파일안에 여러개의 class를 만들면 각각의 class가 파일로서 존재하게 된다.

public class MyOOP {

	public static void main(String[] args) {
		
		Print p1 = new Print("----");
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print p2 = new Print("****");
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		

		
		

	}
	
	
}
