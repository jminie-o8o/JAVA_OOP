

public class This {
	String name;
	int number;
	
	// 밑에는 생성자
	public This(String name) {
		this.name = name; //왼쪽은 필드, 오른쪽은 선언된 변수 //this는 객체 자신을 참조하는 키워드
	}
	
	// 밑에는 기본생성자 (생성자도 오버로딩이 가능하다.)
	public This() {
		this("이름없음",0);
	}
	
	public This(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
		public static void main(String[] args) {
		
			This c1 = new This("올포랜드");
			This c2 = new This("서울시립대");
			System.out.println(c1.name);
			System.out.println(c2.name);
			
			This c3 = new This();
			This c4 = new This("구급차",1111);
			System.out.println(c3.name);
	}


}
