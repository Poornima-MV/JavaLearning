package com.learning.package1;
import com.learning.package0.*;

/**
 * Access modifiers Learning
 * @author Poornima
 *
 */
public class LearningBasics1 {

	public void LearningBasics1Method() {
		LearningBasics  class1= new  LearningBasics();
		class1.getDefaultInteger();
		class1.getDefaultInteger();
		class1.getProtectedInteger();
		Integer publicIntegerfromDiffPackage = class1.publitInteger;
		//Uncomment below to see compilation error 
		//Integer protectedIntegerfromDiffPackage = class1.protectedInteger; 
	}
}
