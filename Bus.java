class Train{
	public void run() {
		System.out.println("�޸���");
	}
}
// taxi�� Train�� ��ӹ���. Train Ŭ������ �޼ҵ带 ��밡��.
class taxi extends Train{
	public void pangpang() {
		System.out.println("����");
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
