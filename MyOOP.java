//Print��� Ŭ���� �ȿ� delimiter, A, B��� �޼ҵ带 �־����� �����Ǿ� �ִٴ� ����� �ξ� �˱� ����.
//�ϳ��� �ڹ����Ͼȿ� �������� class�� ����� ������ class�� ���Ϸμ� �����ϰ� �ȴ�.

public class MyOOP {

	public static void main(String[] args) {
		
		Print p1 = new Print();
		p1.delimiter = "****";
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print p2 = new Print();
		p2.delimiter = "----";
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		Print p3 = new Print();
		p3.delimiter = "^^^^";
		p3.A();
		p3.A();
		p3.B();
		p3.B();
		
		

	}
	
	
}
