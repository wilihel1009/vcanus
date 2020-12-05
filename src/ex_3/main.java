package ex_3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = factorial(4);
		System.out.println(result);
	}
	
	public static int factorial(int i){
		if(i <= 1){
			return i;
		} else {
			return factorial(i - 1) * i;
		}
	}

}
