package kr.co.turnup_fridger.vo;

import java.io.Serializable;
import java.util.List;

public class RecipeInfo implements Serializable{

	private int recipeId;
	private String recipeName;
	private String sumry;
	private int categoryCode;
	private String categoryName;
	private int typeCode;
	private String typeName;
	private String cookingTime;
	private String calorie;
	private String Qnt;
	private String recipeLevel;
	private String irdntCode;
	private String price;
	private String imgUrl;
	private String detUrl;
	private int recipeHits;
	private List<RecipeIrdnt> recipeIrdnts;
	private List<RecipeCrse> recipeCrses;
 	
}
