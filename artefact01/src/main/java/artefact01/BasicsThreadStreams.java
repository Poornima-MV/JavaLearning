package artefact01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

/**
 * Access modifiers Learning
 * @author Poornima
 *
 */
public class BasicsThreadStreams {

	int threadOneCounter=0;
	int threadTwoCounter=0;
	public void LearningBasicsMethod() {

		BasicsAccessModifiers  class1= new  BasicsAccessModifiers();
		class1.getDefaultInteger();
		class1.getDefaultInteger();
		class1.getProtectedInteger();
		Integer publicIntegerfromDiffPackage = class1.publitInteger;
		Integer protectedIntegerfromDiffPackage = class1.protectedInteger;
		Integer defaultIntegerfromDiffPackage = class1.defaultInteger;
		//Uncomment below to see compilation error 
		//Integer privateIntegerfromDiffPackage = class1.privateInteger;
		
	}
	
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.setOut(new PrintStream(new FileOutputStream("/Users/jibinkalyattil/eclipse-workspace/artefact01/src/main/java/artefact01/output.txt")));
		//String reverse
		String testString = "Hell`o World!";
		char[] charArray = testString.toCharArray();

		int size = charArray.length;
		int reverseIndex = 0;
		char[] reversedString = new char[size];
		for (int i = size - 1; i >= 0; i--) {
			System.out.println(charArray[i]);

			reversedString[reverseIndex] = charArray[i];
			reverseIndex++;
		}
		System.out.println("Reversed String---->" + String.valueOf(reversedString));
		//String reverse end
		
		List<char[]> charList = Arrays.asList(charArray);
		for (char[] cs : charList) {
			System.out.println(cs);
		}
		List<String> stringList = Arrays.asList("Poornima","Madathum","Kandy","Vadakeyil");
		List<Integer> intListForStreams = Arrays.asList(1,7,198,234,678,400,23267);
		Arrays.sort(intListForStreams.toArray());
		System.out.println("Sorted");
		for (Integer integer : intListForStreams) {
			System.out.println( integer);
		}
		Arrays.sort(stringList.toArray());
		for (String item : stringList) {
			System.out.println( item);
		}
		
		//Streams intermediate operations- map(), filter(), sorted()
		
		System.out.println( "Streams intermediate operations- map()");
		//map()
		List<Integer> streamRefinedList = intListForStreams.stream().map(x -> x*x).toList();
		for (Integer item : streamRefinedList) {
			System.out.println( item);
		}
		System.out.println( "Streams intermediate operations- filter()");
		//filter()
		List<String> streamRefinedListString = stringList.stream().filter(x -> x.contains("ma")).toList();
		for (String item : streamRefinedListString) {
			System.out.println( item);
		}
		System.out.println( "Streams intermediate operations- sorted()");
		//sorted()
		
		List<String> stringListSortedWithStream= stringList.stream().sorted().toList();
		for (String item : stringListSortedWithStream) {
			System.out.println( item);
		}
		System.out.println( "Streams Terminal operations- foreEach()");
		//Terminal function - foreEach()
		intListForStreams.stream().sorted().forEach(y -> {
			if (y > 100) {
				System.out.println(y);
			}
		});
		//Terminal function - reduce()
		System.out.println( "Streams Terminal operations- reduce()");
		int reducedValueFromIntList = intListForStreams.stream().filter(x -> (x%2==0)).reduce(0, (y, i) -> y + i);
		System.out.println( "Reduced list---"+reducedValueFromIntList);
		
		String concatedUsingReduce = stringList.stream().reduce("", (a,b) -> a+" "+b);
		System.out.println( "Concatenated---"+concatedUsingReduce);
		
		//Combine two list to a single list containing identical elements from both
		
		List<String> compareListOne = Arrays.asList("water", "lilly", "rose",
				"hibiscus", "Dahlia", "Camilla", "random");
		List<String> compareListTwo = Arrays.asList("water", "lilly", "rose",
				"hibiscus", "Dahlia", "Camilla", "abcd", "random");
		List<String> result = Arrays.asList("");
		result = compareListTwo.stream().filter(x -> compareListOne.contains(x))
				.toList();
		System.out.println("list compare");
		result.stream().forEach(x -> System.out.println(x));
		
		ThreadDemoClassOne threadOne = new ThreadDemoClassOne();
		ThreadDemoClassTwo threadTwo = new ThreadDemoClassTwo();
		//threadOne.start();
		//threadOne.join();
		//threadTwo.start();
		
		//hashcode 
		String hascodeTest = "Poornima";
		String hascodeTest2 = "Poornima";
		String hascodeTest3 = "poornima";
		System.out.println("hashcode value-->" + hascodeTest.hashCode() + "second value-->" + hascodeTest2.hashCode()+
				"third value-->" + hascodeTest3.hashCode());
		
		
	}

	private  synchronized void method() {
		List<Integer> threadList =  Arrays.asList(1,7,198,234,678,400,23267);
	}
	
}

class ThreadDemoClassOne extends Thread{

	 int counterOne =0;
	@Override
	public void run() {
		while(counterOne<=10 ) {
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println( "From thread 1---"+counterOne);
			counterOne++;
		}
		
		
	}
	
}

class ThreadDemoClassTwo extends Thread{
	 int counterTwo =0;
	@Override
	public void run() {
		while(counterTwo<=10 ) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println( "From thread 2---"+counterTwo);
			counterTwo++;
		}
		
		
	}
	
}
