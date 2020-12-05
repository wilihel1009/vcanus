package ex_4;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = factorial(4);
		System.out.println(result);
	}
	
	public static int factorial(int i){
		return factorial_tail(i, 1);
	}
	
	public static int factorial_tail(int i, int d){
		if(i <= 1){
			return d;
		} else {
			return factorial_tail(i - 1, i * d);
		}
	}

}
