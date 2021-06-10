class Accounting {
	public double valueOfSupply;

	public static double vatRate = 0.1; //부가가치세율일경우는 어느경우든 동일하기때문에 이럴경우에는
										//클래스의 소속인 static으로 두는게 나을 수 있다.
	
	//생성자로 입력값 강제하기
	public Accounting(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
	}
	
	public double getVAT() {
		return valueOfSupply * vatRate;
	}
	
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
}

public class AccountingApp {
		
	public static void main(String[] args) {
		
		Accounting a1 = new Accounting(10000.0);
		
		Accounting a2 = new Accounting(20000.0);
		
		System.out.println("value of supply : " + a1.valueOfSupply); //a1의 valueOfSupply는 인스턴스 소속 따라서 static이 없어야함
		System.out.println("value of supply : " + a2.valueOfSupply);
		
		System.out.println("VAT : " + a1.getVAT());
		System.out.println("VAT : " + a2.getVAT());
		
		System.out.println("Total : " + a1.getTotal());
		System.out.println("Total : " + a2.getTotal());


	}

}
