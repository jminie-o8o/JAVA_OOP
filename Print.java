class Test {
    public static int no = 0;
}

public class Print{
    public static void main(String[] args) {


        Test a = new Test();
        Test b = new Test();
        a.no = 101;


        System.out.println(b.no);
    }
}