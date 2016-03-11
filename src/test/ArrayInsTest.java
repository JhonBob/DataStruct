
package test;

import java.util.Random;

import element.ArrayIns;


public class ArrayInsTest {
	private static int maxSize=100;
	private static ArrayIns arr;
	
	
	public static void run(){
		arr=new ArrayIns(maxSize);
		Random random=new Random();
		
		for (int i = 0; i < 10; i++) {
			int value=random.nextInt(25)+2;
			arr.insert(value);
		}
		
		arr.display();
		arr.insertionSort();
		arr.display();
		
	}
}
