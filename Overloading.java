
class Cal {
	public int sum(int v1, int v2) {
		System.out.println("I'm Mom");
		return v1 + v2;
	}
    
	// �Ű������� ���� �ٸ��� �Ͽ� ���� �̸��� �޼ҵ带 �� ���� �� �ִ�.
	public int sum(int v1, int v2, int v3) {
		return v1 + v2 + v3;
	}
    
    // �Ű������� ���¸� �ٸ��� �Ͽ� ���� �̸��� �޼ҵ带 ���� ���� �ִ�.
    public String sum(String x1, String x2){
    	return x1 + x2;
    }
}
    
 class Cal3 extends Cal{
	 public int sum(int v1, int v2) {
		 super.sum(v1, v2);
		 System.out.println("override!!!"); // �θ��� sum�޼ҵ带 ���ο� ����� �־� ������
		 return v1 + v2;
	 }
  }
 


public class Overloading {
	
	public static void main (String[] args) {
		Cal3 c1 = new Cal3();
		System.out.println(c1.sum(1, 2));
				
	}
}
