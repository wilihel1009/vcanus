package ex_2;

public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal1 = new Calculator();
		Calculator cal2 = new Calculator();
		Calculator cal3 = new Calculator();
		int a = cal1.out();
		System.out.println(a);
		int b = cal2.add(1).out();
		System.out.println(b);
		int c = cal3.add(3).subtract(1).out();
		System.out.println(c);
	}
	
}
