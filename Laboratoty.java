
class FOO {
	public static String classvar = "I class var";
	public String instancevar = "I instance var";
	public static void classMethod() {
		System.out.println(classvar);
//		System.out.println(instancevar);//error
	}
	public void instanceMethod() {
		System.out.println(classvar); //인스턴스변수 안에서는 클래스변수와 인스턴스변수 모두 접근가능
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
