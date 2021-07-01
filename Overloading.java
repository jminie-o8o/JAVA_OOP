
class Cal {
	public int sum(int v1, int v2) {
		System.out.println("I'm Mom");
		return v1 + v2;
	}
    
	// 매개변수의 수를 다르게 하여 같은 이름의 메소드를 또 만들 수 있다.
	public int sum(int v1, int v2, int v3) {
		return v1 + v2 + v3;
	}
    
    // 매개변수의 형태를 다르게 하여 같은 이름의 메소드를 만들 수도 있다.
    public String sum(String x1, String x2){
    	return x1 + x2;
    }
}
    
 class Cal3 extends Cal{
	 public int sum(int v1, int v2) {
		 super.sum(v1, v2);
		 System.out.println("override!!!"); // 부모의 sum메소드를 새로운 기능을 넣어 재정의
		 return v1 + v2;
	 }
  }
 


public class Overloading {
	
	public static void main (String[] args) {
		Cal3 c1 = new Cal3();
		System.out.println(c1.sum(1, 2));
				
	}
}
