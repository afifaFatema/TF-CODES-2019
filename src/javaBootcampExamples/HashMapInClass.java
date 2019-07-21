package javaBootcampExamples;

import java.util.HashMap;

public class HashMapInClass {

	public static void main(String[] args) {
		
		HashMap<String, String>CapitalCities = new HashMap<String, String>();
		CapitalCities.put("England", "London");
		CapitalCities.put("India", "Delhi");
		CapitalCities.put("USA", "D.C.");
		CapitalCities.put("Germany", "Berlin");
		
		System.out.println(CapitalCities.get("England"));
		System.out.println(CapitalCities);
	}

}
