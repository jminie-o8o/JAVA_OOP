
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
	
	//��� Ŭ������ �ν��Ͻ�ȭ ���� ���� ä�� ����� �� ����. �ؾ Ʋ�� Ŭ���������� �ؾƲ�� ���� ���� ���°� ó��
	//static ������ �ν��Ͻ��� �ƴ� Ŭ������ �ͼӵȴ�. ���� �ν��Ͻ��� ������ �����Ǿ static������ �� �ϳ��� �ִ�.
	public static void main(String[] args) {
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value); 
		VariableScope v1 = new VariableScope();
		System.out.println(v1.globalScope);
		System.out.println(staticVal);

	}

}
