package ex_1;

public class sugarRecipe implements Recipe{
	private int flour = 100;
	private int water = 50;
	private int sugar = 200;
	
	@Override
	public void printRecipe() {
		System.out.println("Recipe");
		System.out.println("flour : " + this.flour);
		System.out.println("water : " + this.water);
		System.out.println("sugar : " + this.sugar);
	}
}
