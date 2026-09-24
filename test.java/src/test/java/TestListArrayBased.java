package test.java;

import java.util.ArrayList;

public class TestListArrayBased {

	private static int numItems;
	private static int index;
	static Object display = null;

	public static void main(String[] args) {
		
		ListArrayBased aList = new ListArrayBased();
		System.out.println("Is the list empty?: " + aList.isEmpty());
		
		
		int milk = 1;
		int eggs = 2;
		int butter = 3;
		int apple = 4;
		int bread = 5;
		
		aList.add(1, milk);
		aList.add(2, eggs);
		aList.add(3, butter);
		aList.add(4, apple);
		aList.add(5, bread);
		
		System.out.println("The item number is " + aList.get(1));
		System.out.println(display);
		
		
			
		}
	
	public static void displayList(ListArrayBased aList) {
		
		for(int index = 1; index < aList.size(); index++) {
			display = aList.get(index);
			System.out.println(display);
					
		}
		
	
	}
	
	public void createList() {
		
		
		
	}
	
	public boolean isEmpty() {
		return false;
		
	}
	
	
	public int size1() {
		return numItems;
		
	}
	
	public void add(String index, int numItems) {
		
			
	}
	
	public void remove() {
		numItems
		
	}
	
	public void removeAll() {
		numItems = 0;
		
	}
	
	public String get(String index) {
		return "the iem at position index of a list:" + get(index);
		
		if (1 < index || index size() + 1) {
			throw new IndexOutOfBoundsException("Incorrect Index: " + index);
		
		}
			
		
	}
	
	
	
	
}
	
		



