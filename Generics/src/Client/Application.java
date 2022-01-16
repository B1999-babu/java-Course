package Client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
	public static void main(String args[]) {
		
		Comtainer<Integer , String> container=new Comtainer<>(12,"Hello");
	
		int val1=container.getItem1();
		String val2=container.getItem2();
		
		Set<String> mySet1=new HashSet<String>();
		mySet1.add("first");
		mySet1.add("second");
		mySet1.add("third");
		mySet1.add("second");
		
		
		Set<String> mySet2=new HashSet<String>();
		mySet1.add("first");
		mySet1.add("second");
		mySet1.add("third");
		mySet1.add("second");
		
		Set resultSet=union(mySet1,mySet2);
		Iterator itr=resultSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	public static<E> Set<E> union(Set<E> set1,Set<E> set2) {
		Set<E> result=new HashSet<E>(set1);
		result.addAll(set2);
		return result;
	}

}
