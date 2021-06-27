
public class VariableScope {
	int globalScope = 10;
	static int staticVal = 7;
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(value2);

	}
	
	//모든 클래스는 인스턴스화 하지 않은 채로 사용할 수 없다. 붕어빵 틀이 클래스이지만 붕어빵틀을 먹을 수는 없는것 처럼
	//static 변수는 인스턴스가 아닌 클래스에 귀속된다. 따라서 인스턴스가 여러개 생성되어도 static변수는 딱 하나만 있다.
	public static void main(String[] args) {
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value); 
		VariableScope v1 = new VariableScope();
		System.out.println(v1.globalScope);
		System.out.println(staticVal);

	}

}
