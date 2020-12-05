package ex_2;

public class Calculator {
	private int result;
	
	public Calculator(){
		result = 0;
	}
	
	public Calculator add(int a){
		this.result += a;
		return this;
	}
	
	public Calculator subtract(int a){
		this.result -= a;
		return this;
	}
	
	int out(){
		return result;
	}
}
