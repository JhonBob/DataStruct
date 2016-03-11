package test;

import java.util.Random;

import element.ArrayBub;


public class ArrayBubTest {

	private static int maxSize=100;
	private static ArrayBub arr;
	
	
	public static void run(){
		arr=new ArrayBub(maxSize);
		Random random=new Random();
		
		for (int i = 0; i < 10; i++) {
			int value=random.nextInt(25)+2;
			arr.insert(value);
		}
		
		arr.display();
		arr.bubbleSort();
		arr.display();
		
	}
}
