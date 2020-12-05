package ex_1;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] order = {"cream", "sugar", "butter"};
		ArrayList<Bread> bl = new BreadListFactory().createBreadList(order);
		
		for(Bread b : bl) {
			b.printBread();
		}
	}

}
