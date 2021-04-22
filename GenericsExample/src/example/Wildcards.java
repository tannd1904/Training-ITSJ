package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wildcards {
	//Upper Bounded Wildcard
	public static Double add(ArrayList<? extends Number> num) {
		double sum = 0.0;
		for (Number number : num) {
			sum += number.doubleValue();
		}
		return sum;
	}
	
	//Unbounded Wildcard
	public static void display(List<?> list) {
		for (Object o: list) {
			System.out.println(o);
		}
	}
	
	//Lower Bounded Wildcard
	public static void addNum(List<? super Integer> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}
	
	public static void main(String[] args) {
		//Example of upper bound wildcard
		System.out.println("---Example of Upper Bound Wildcard---");
		//with Integer
		ArrayList<Integer> ex1_l1 = new ArrayList<>();
		ex1_l1.add(10);
		ex1_l1.add(20);
		System.out.println("Display the sum of Integer: " + add(ex1_l1));
		//with Double
		ArrayList<Double> ex1_l2 = new ArrayList<>();
		ex1_l2.add(11.5);
		ex1_l2.add(22.5);
		System.out.println("Display the sum of Double: " + add(ex1_l2));
		
		
		//Example of unbound wildcard
		System.out.println("---Example of Unbound Wildcard---");
		//with Integer
		List<Integer> ex2_l1 = Arrays.asList(1,2,3);
		System.out.println("Display the list of Integer");
		display(ex2_l1);
		//with String
		List<String> ex2_l2 = Arrays.asList("One", "Two", "Three");
		System.out.println("Display the list of String");
		display(ex2_l2);
		
		
		//Example of lower unbound wildcard
		System.out.println("---Example of Lower Bound Wildcard---");
		//with Integer
		List<Integer> ex3_l1 = Arrays.asList(1,2,3);
		System.out.println("Display the list of Integer");
		addNum(ex3_l1);
		//with Integer
		List<Number> ex3_l2 = Arrays.asList(1.1,2.2,3.3);
		System.out.println("Display the list of Integer");
		addNum(ex3_l2);
	}
}
