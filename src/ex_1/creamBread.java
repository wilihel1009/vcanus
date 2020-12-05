package ex_1;

public class creamBread implements Bread{
	private String breadType;
	private Recipe recipe;
	
	public creamBread(String breadType) {
		this.breadType = breadType;
		this.recipe = new RecipeFactory().createRecipe(breadType);
	}

	@Override
	public void printBread() {
		System.out.println("breadType : " + breadType);
		this.recipe.printRecipe();
		System.out.print("\n");
	}

}
