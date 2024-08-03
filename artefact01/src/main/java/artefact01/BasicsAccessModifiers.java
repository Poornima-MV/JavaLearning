package artefact01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Access modifiers Learning
 * 
 * @author Poornima
 *
 */
public class BasicsAccessModifiers {

	/**
	 * Access modifiers in increasing order of restriction Public - Anywhere
	 * Protected - Same package and extended classes from other package Default
	 * - no keyword ,but if nothing declared only within the same package
	 * Private - Only within the same class
	 */

	/**
	 * Java 8 striking features 1.Stream 2.Lamda expression 3.Interface can have
	 * a default method
	 */

	public int publitInteger = 0; //Anywhere
	int defaultInteger = 0; //same package
	protected int protectedInteger = 0;  //package and child classes
	private int privateInteger = 0; //only current class
	

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

		System.out.print("Hello world from MAC OS\n Java version is "
				+ System.getProperty("java.version"));
	}

	public int getDefaultInteger() {
		return defaultInteger;
	}

	public void setDeSfaultInteger(int defaultInteger) {
		this.defaultInteger = defaultInteger;
	}

	// public int hashCode() {
	// return publitInteger;
	// }

	public static <HotSpotDiagnosticMXBean> void main(String[] args) throws FileNotFoundException {
		System.setOut(new PrintStream(new FileOutputStream("/Users/jibinkalyattil/eclipse-workspace/artefact01/src/main/java/artefact01/output.txt")));
		
		BasicsAccessModifiers LearningBasicsAccessModifiers = new BasicsAccessModifiers();
		System.out.println(
				"Hashcode value---" + LearningBasicsAccessModifiers.hashCode());
		BasicsAccessModifiers LearningBasicsAccessModifiersOne = new BasicsAccessModifiers();
		System.out
				.println("one equlas two---" + LearningBasicsAccessModifiersOne
						.equals(LearningBasicsAccessModifiers));
		System.out.println("one equlas two using == operator---"
				+ (LearningBasicsAccessModifiersOne == LearningBasicsAccessModifiers));
		System.out.println(
				"one hashcode equals two---" + (LearningBasicsAccessModifiersOne
						.hashCode() == LearningBasicsAccessModifiers
								.hashCode()));
		System.out.println("Hashcode values---"
				+ LearningBasicsAccessModifiersOne.hashCode() + ","
				+ LearningBasicsAccessModifiers.hashCode());
		
		// Primitive type Integer

		Integer firstVariable = 1;
		Integer secondVariable = 1;
		System.out.println("\nPrimitive values starts---");
		System.out.println("-----------------------------");
		System.out.println("one equlas two primitive---"
				+ (firstVariable.equals(secondVariable)));
		System.out.println("one equlas two using == operator---"
				+ (firstVariable == secondVariable));
		System.out.println("one hashcode equals two---"
				+ (firstVariable.hashCode() == secondVariable.hashCode()));
		System.out.println("Hashcode values---" + firstVariable.hashCode() + ","
				+ secondVariable.hashCode());

		// Primitive type String

		String firstVariableString = "Rose";
		String secondVariableString = "Rose";
		System.out.println("\nPrimitive values for String starts---");
		System.out.println("-----------------------------");
		System.out.println("one equlas two primitive---"
				+ (firstVariableString.equals(secondVariableString)));
		System.out.println("one equlas two using == operator---"
				+ (firstVariableString == secondVariableString));
		System.out.println("one hashcode equals two---" + (firstVariableString
				.hashCode() == secondVariableString.hashCode()));
		System.out.println("Hashcode values---" + firstVariableString.hashCode()
				+ "," + secondVariableString.hashCode());
		
		//Heap dump
		long pid = ProcessHandle.current().pid();
		System.out.println("\nProcess ID---"+pid);
		
		//Math rounding
		float floatValue = 9.678f; 
		float floatValue1 = 9.5f; 
		float floatValue2 = 9.49f; 
		System.out.println("\nMath.round value of---"+floatValue+" :: "+Math.round(floatValue));
		System.out.println("\nMath.ceil value of---"+floatValue+" :: "+Math.ceil(floatValue));
		System.out.println("\nMath.floor value of---"+floatValue+" :: "+Math.floor(floatValue));
		
		System.out.println("\nMath.round value of---"+floatValue1+" :: "+Math.round(floatValue1));
		System.out.println("\nMath.ceil value of---"+floatValue1+" :: "+Math.ceil(floatValue1));
		System.out.println("\nMath.floor of---"+floatValue1+" :: "+Math.floor(floatValue1));
		
		System.out.println("\nMath.round value of---"+floatValue2+" :: "+Math.round(floatValue2));
		System.out.println("\nMath.ceil value of---"+floatValue2+" :: "+Math.ceil(floatValue2));
		System.out.println("\nMath.floor of---"+floatValue2+" :: "+Math.floor(floatValue2));

	}

}
