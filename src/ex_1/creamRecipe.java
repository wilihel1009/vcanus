package ex_1;

public class creamRecipe implements Recipe{
	private int flour = 100;
	private int water = 100;
	private int cream = 200;
	
	@Override
	public void printRecipe() {
		System.out.println("Recipe");
		System.out.println("flour : " + this.flour);
		System.out.println("water : " + this.water);
		System.out.println("cream : " + this.cream);
	}
}
