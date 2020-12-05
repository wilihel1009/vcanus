package ex_1;
import java.util.ArrayList;

public class BreadListFactory {
	public ArrayList<Bread> createBreadList(String[] breadType){
		BreadFactory bf = new BreadFactory();
		ArrayList<Bread> list = new ArrayList<Bread>();
		
		for(String bt : breadType) {
			list.add(bf.createBread(bt));
		}
		
		return list;
	}
}
