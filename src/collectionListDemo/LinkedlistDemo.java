package collectionListDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> StudName=new LinkedList<>();
		
		StudName.add("rohini");
		StudName.add("vidhi");
		StudName.add("sandeep");
		StudName.add("sai");
		StudName.add("minu");
		StudName.add("navin");
		
		Iterator<String> itr=StudName.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
