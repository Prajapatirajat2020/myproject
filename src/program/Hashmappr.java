package program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Hashmappr {
	public static void main(String[] args) {
		HashMap<Integer,String> hr = new HashMap<Integer,String>();
		hr.put(1,"Rajat");
		hr.put(2,"kamal");
		hr.put(3, "kajol");
		
		Iterator<Entry<Integer, String>> it =hr.entrySet().iterator();
		while(it.hasNext()){
			Entry<Integer, String>e=it.next();
			System.out.println("key is :" +e.getKey()+" value is: "+e.getValue());
		}
	}

}
