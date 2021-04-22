package example;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		//Initialize the hashmap
		HashMap<String, Intern> hashMapEx = new HashMap<>();
		
		//Add 4 Intern object to the hashmap
		hashMapEx.put("0093", new Intern("Tuan", 22, "Male"));
		hashMapEx.put("0094", new Intern("Tan", 22, "Male"));
		hashMapEx.put("0095", new Intern("Hop", 21, "Female"));
		hashMapEx.put("0096", new Intern("Thu", 21, "Female"));
		
		//Show the hashmap
		System.out.println("The hashmap: ");
		for (String i : hashMapEx.keySet()) {
			System.out.println("ID: " + i + ": " + hashMapEx.get(i).show());
		}
		
		//Add 1 more Intern object
		hashMapEx.put("0097", new Intern("Another Intern", 20, "None"));
		
		//Show the hashmap again after updating
		System.out.println("The hashmap after updating: ");
		for (String i : hashMapEx.keySet()) {
			System.out.println("ID: " + i + ": " + hashMapEx.get(i).show());
		}
		
		//Removing a object
		hashMapEx.remove("0097");
		
		//Show the hashmap again to check
		System.out.println("The hashmap after removing: ");
		for (String i : hashMapEx.keySet()) {
			System.out.println("ID: " + i + ": " + hashMapEx.get(i).show());
		}
	}
}
