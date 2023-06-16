package com.learning.package0;

/**
 * Access modifiers Learning
 * @author Poornima
 *
 */
public class LearningBasics {
	
	/**
	 * Access modifiers in increasing order of restriction 
	 * Public - Anywhere
	 * Protected - Same package and extended classes from other package 
	 * Default - no keyword ,but if nothing declared only within the same package 
	 * Private  - Only within the same class
	 */
	
	public int publitInteger =0;
	int defaultInteger =0;
	protected int protectedInteger=0;
	private int privateInteger=0;

	 public int getProtectedInteger() {
		return protectedInteger;
	}

	public void setProtectedInteger(int protectedInteger) {
		this.protectedInteger = protectedInteger;
	}

	public void setDefaultInteger(int defaultInteger) {
		this.defaultInteger = defaultInteger;
	}

	public void LearningBasicsMethod() {
		
		System.out.print("Hello world from MAC OS\n Java version is " + System.getProperty("java.version"));
	}

	public int getDefaultInteger() {
		return defaultInteger;
	}

	public void setDeSfaultInteger(int defaultInteger) {
		this.defaultInteger = defaultInteger;
	}
	
	
	 

}
