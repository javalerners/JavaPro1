package collectionListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList <String> StudName=new ArrayList<>();
		
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
