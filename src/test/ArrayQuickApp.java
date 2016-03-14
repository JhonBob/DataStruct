package test;

import sortArray.ArrayQuick;

public class ArrayQuickApp {
	public static void run(){
		int maxSize=16;
		ArrayQuick arr;
		arr=new ArrayQuick(maxSize);
		for (int i = 0; i < maxSize; i++) {
			long n=(long) (Math.random()*99);
			arr.insert(n);
		}
		arr.display();
		arr.quickSort();
		arr.display();
	}
}
