
class FOO {
	public static String classvar = "I class var";
	public String instancevar = "I instance var";
	public static void classMethod() {
		System.out.println(classvar);
//		System.out.println(instancevar);//error
	}
	public void instanceMethod() {
		System.out.println(classvar); //�ν��Ͻ����� �ȿ����� Ŭ���������� �ν��Ͻ����� ��� ���ٰ���
		System.out.println(instancevar);
	}
}

public class Laboratoty {

	public static void main(String[] args) {
		System.out.println(FOO.classvar); //OK
//		System.out.println(FOO.instancevar); //error
		FOO.classMethod();
//		FOO.instanceMethod(); //error
		
		FOO f1 = new FOO();

	}

}
