package kr.co.turnup_fridger.dao;

import java.util.List;

import kr.co.turnup_fridger.vo.RecipeIrdnt;

public interface RecipeIrdntDao {

	/**
	 * 새로운 재료정보를 입력
	 * @param recipeIrdnt
	 * @return
	 */
	int insertRecipeIrdnt(RecipeIrdnt recipeIrdnt);
	
	/**
	 * 재료정보를 수정
	 * @param recipeIrdnt
	 * @return
	 */
	int updateRecipeIrdnt(RecipeIrdnt recipeIrdnt);
	
	/**
	 * 재료정보를 삭제
	 * @param recipeId
	 * @return
	 */
	int deleteRecipeIrdnt(int recipeId);
	
	/**
	 *모든 재료정보들을 리턴 
	 * @return
	 */
	List<RecipeIrdnt> selectAllRecipeIrdnt();
	
	/**
	 * 레시피코드로 해당하는 재료정보들을 리턴
	 * @param recipeId
	 * @return
	 */
	List<RecipeIrdnt> selectRecipeIrdntById(int recipeId);
	
	/**
	 * 재료정보의 pk인 재료순번으로 해당하는 재료를 찾아내기.
	 * @param irdntNo
	 * @return
	 */
	RecipeIrdnt selectRecipeIrdntByNo(int irdntNo);
	
	/**
	 * 입력받은 재료명으로 일치하는 재료들을 찾기.
	 * @param irdntName
	 * @return
	 */
	List<RecipeIrdnt> selectRecipeIrdntByName(String irdntName);
	
	/**
	 * 입력받은 재료id로 해당하는 재료정보의 레시피 재료정보들을 반환. (1개만)?
	 * @param irdntId
	 * @return
	 */
	List<RecipeIrdnt> getRecipeCodeByIrdntId(List irdntId);
	
	
}
