package ex_1;

public class RecipeFactory {

	public Recipe createRecipe(String breadType) {
		switch(breadType) {
			case "cream" : return new creamRecipe();
			case "sugar" : return new sugarRecipe();
			case "butter" : return new butterRecipe();
		}
		
		return null;
	}

}
