package artefact01;

import java.util.ArrayList;

public class ThreadsOnly {
	public static void main(String[] stringArgs) throws InterruptedException {
		
		DriverClass  DriverClass =  new DriverClass();
		DriverClass.driverMethod();
	}
}


 class DriverClass {
	
   ArrayList<Integer> integerList = new ArrayList<Integer>(10);
   void driverMethod() throws InterruptedException {
		int i=1;
		while(integerList.get(9) != null) {
			
			
			addItemtoCharArray(i++);
			System.out.println("Last item---"+getLastItemFromCharArray());
		}
	}

	
	
	public synchronized  int  getLastItemFromCharArray() throws InterruptedException {
		if(integerList.get(9) == null) {
		wait();
		}
		notifyAll();
		return integerList.get(9);
	}
	
	public synchronized  void  addItemtoCharArray(int item) throws InterruptedException {
		if(integerList.get(9) != null) {
			wait();
		}
		integerList.add(item);
		notifyAll();
	}
	
	
	
}
