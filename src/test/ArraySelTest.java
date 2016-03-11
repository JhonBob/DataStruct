package test;

import java.util.Random;

import element.ArraySel;


public class ArraySelTest {
	private static int maxSize=100;
	private static ArraySel arr;
	
	
	public static void run(){
		arr=new ArraySel(maxSize);
		Random random=new Random();
		
		for (int i = 0; i < 10; i++) {
			int value=random.nextInt(25)+2;
			arr.insert(value);
		}
		
		arr.display();
		arr.selectionSort();
		arr.display();
		
	}
}
