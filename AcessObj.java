
class AceessObjExam{
	public int p = 3;
	protected int p2 = 4;
	int k = 3;
	private int i = 1;
}

public class AcessObj {
	public static void main(String[] args) {
		AceessObjExam obj = new AceessObjExam();
		System.out.println(obj.p);
		System.out.println(obj.p2);
		System.out.println(obj.k);
//		System.out.println(obj.i); //접근제한자가 pivate기 때문에 접근불가능

	}
}
