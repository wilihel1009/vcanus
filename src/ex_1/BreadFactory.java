package ex_1;

public class BreadFactory {

	public Bread createBread(String breadType) {
		switch(breadType) {
			case "cream" : return new creamBread(breadType);
			case "sugar" : return new sugarBread(breadType);
			case "butter" : return new butterBread(breadType);
		}
		
		return null;
	}

}
