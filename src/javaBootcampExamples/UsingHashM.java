package javaBootcampExamples;

import java.util.HashMap;
import java.util.Map;

public class UsingHashM {

	public static void main(String[] args) {
		
		String  a = "This is Afifa";
		String[] splitted = a.split("   ");
		Map<String, Integer> hm = new HashMap<String, Integer>();
		
		for(int i=0; i<splitted.length ; i++) {
			if (hm.containsKey(splitted[i])){
			int cont = hm.get(splitted[i]);
			hm.put(splitted[i], cont + 1);
			} 
		else {
			hm.put(a, 1);			
			}
			System.out.println(hm);
	
		}
		
	}
}

