
class OverloadingExam {
	
	// Ư�� �̸��� ���� �޼ҵ尡 �ִٰ� ������ �츮�� ���� �̸��� ���� �޼ҵ带 �� ���� �� �ִ�.
	// �̰��� �����ε��̶�� �Ѵ�.
	// �����ε����� �Ű������� ���� �ٸ��ų� Ÿ���� �޶�� �����ϴ�.
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
