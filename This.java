

public class This {
	String name;
	int number;
	
	// �ؿ��� ������
	public This(String name) {
		this.name = name; //������ �ʵ�, �������� ����� ���� //this�� ��ü �ڽ��� �����ϴ� Ű����
	}
	
	// �ؿ��� �⺻������ (�����ڵ� �����ε��� �����ϴ�.)
	public This() {
		this("�̸�����",0);
	}
	
	public This(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
		public static void main(String[] args) {
		
			This c1 = new This("��������");
			This c2 = new This("����ø���");
			System.out.println(c1.name);
			System.out.println(c2.name);
			
			This c3 = new This();
			This c4 = new This("������",1111);
			System.out.println(c3.name);
	}


}
