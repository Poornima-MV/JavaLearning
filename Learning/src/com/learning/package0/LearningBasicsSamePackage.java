package com.learning.package0;

/**
 * Access modifiers Learning
 * @author Poornima
 *
 */
public class LearningBasicsSamePackage {

	public void LearningBasicsMethod() {

		LearningBasics  class1= new  LearningBasics();
		class1.getDefaultInteger();
		class1.getDefaultInteger();
		class1.getProtectedInteger();
		Integer publicIntegerfromDiffPackage = class1.publitInteger;
		Integer protectedIntegerfromDiffPackage = class1.protectedInteger;
		Integer defaultIntegerfromDiffPackage = class1.defaultInteger;
		//Uncomment below to see compilation error 
		//Integer privateIntegerfromDiffPackage = class1.privateInteger;
		
	}

}
