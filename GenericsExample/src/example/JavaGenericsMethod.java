package example;

import java.util.Iterator;

public class JavaGenericsMethod {
	public static <E> void printArray(E[] elements) {
		for (E e : elements) {
			System.out.println(e);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Integer[] intArr = {10,20,30,40,50};
		String[] strArr = {"Tan","Tuan","Thu","Hop"};
		
		System.out.println("Print int array: ");
		printArray(intArr);
		
		System.out.println("Print string array: ");
		printArray(strArr);
	}
}
