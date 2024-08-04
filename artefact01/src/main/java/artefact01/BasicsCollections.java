package artefact01;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.security.Timestamp;
import java.util.*;
import java.util.Map.Entry;


public class BasicsCollections {
	
	public static void main(String args[]) throws FileNotFoundException { //Supply this in run config
		System.setOut(new PrintStream(new FileOutputStream("src/main/java/artefact01/output.txt")));
		System.out.println(args);
		
		//Both map implementation does key overriding if duplicate keys
		//1.Not thread safe  2.Allows NULL keys
		Map<Integer,String> maptoTestStreamsHashMap = new HashMap();
		maptoTestStreamsHashMap.put(1, "Green");
		maptoTestStreamsHashMap.put(2, "Blue");
		maptoTestStreamsHashMap.put(3, "Red");
		maptoTestStreamsHashMap.put(null, "Purple");
		System.out.println(maptoTestStreamsHashMap);
		
		
		//Hash Table
		//1.NULLS not allowed as key LN:25
		//1.Thread safe  2.NULL keys not allowed
		//Initial capacity and load factor arguments required at declaration - default 16 and 0.75f
		Map<Integer,String> maptoTestStreamsHashTable = new Hashtable<>();
		maptoTestStreamsHashTable.put(1, "Green");
		maptoTestStreamsHashTable.put(2, "Blue");
		maptoTestStreamsHashTable.put(3, "Red");
		//maptoTestStreamsHashTable.put(null, "Purple");//NPE thrown here, null keys not allowed
		System.out.println(maptoTestStreamsHashTable);
		
		
		
		//Using streams on Map 
		
		Set<Entry<Integer, String>> mapEntriesSet = maptoTestStreamsHashTable.entrySet();
		mapEntriesSet.stream().forEach(y  -> System.out.println(y.getKey()+" "+ y.getValue()));
		
		//Sets is another collection interface- HasSet and linkedHashSet
		//1.No duplicates allowed
		Set <String> setExample = new HashSet<>();
		setExample.add("Rose");
		setExample.add("Rose");
		System.out.println(setExample);
		setExample.stream().map(y -> y+" Flower ").forEach(y -> System.out.println(y));
		
		//LinkedLIst and ArrayList time comparison
		//Traversal comparison
		List<Integer> linkedListTest = new LinkedList<>();
		for(int i=0;i<100;i++) {
			linkedListTest.add(i);
		}
		long statTime = System.currentTimeMillis();
		linkedListTest.stream().forEach(y ->System.out.println(y));
		long endTime = System.currentTimeMillis();
		System.out.println("LinkedList iteration time---"+(endTime-statTime));
		
		List<Integer> arrayListTest = new LinkedList<>();
		for(int i=0;i<100;i++) {
			arrayListTest.add(i);
		}
		long statTime1 = System.currentTimeMillis();
		arrayListTest.stream().forEach(y ->System.out.println(y));
		long endTime1 = System.currentTimeMillis();
		System.out.println("LinkedList iteration time---"+(endTime-statTime));
		System.out.println("ArrayList iteration time---"+(endTime1-statTime1));
		long statTimeadd = System.currentTimeMillis();
		
		//Get an item comparison
		
		long statTimeGet = System.currentTimeMillis();
		linkedListTest.get(99);
		long endTimeGet = System.currentTimeMillis();
		System.out.println("LinkedList Retrieval time---"+(endTime-statTime));
		
		long statTimeGetArray = System.currentTimeMillis();
		arrayListTest.get(99);
		long endTimeGetArray = System.currentTimeMillis();
		System.out.println("ArrayList Retrieval time---"+(endTimeGetArray-statTimeGetArray));
		
		//Add item comparison
		
		long statTimeAdd = System.currentTimeMillis();
		linkedListTest.remove(80);
		long endTimeAdd = System.currentTimeMillis();
		System.out.println("endTimeAdd  statTimeAdd---"+endTimeAdd +","+ statTimeAdd);
		System.out.println("LinkedList Add item time---"+(endTimeAdd-statTimeAdd));
		
		long statTimeAddArray = System.currentTimeMillis();
		arrayListTest.remove(80);
		long endTimeAddArray = System.currentTimeMillis();
		System.out.println("ArrayList Add item time---"+(endTimeAddArray-statTimeAddArray));
		
		/**Conclusion 
		ArrayList underline uses array- Traversal, getting an item faster
		LinkedList used doubly linked list- traversal slow, getting an item slow.
		But add or remove faster */
		
		System.out.println("Thread.currentThread().isAlive()---"+Thread.currentThread().isAlive());
		System.out.println("Thread.currentThread()---"+Thread.currentThread());
		System.out.println("Thread.currentThread().isDaemon()---"+Thread.currentThread().isDaemon());
		
		
	}

}
