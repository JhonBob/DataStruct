package test;

import sortArray.ArraySh;

public class ShellSortApp {

	public static void run(){
		int maxSize = 20;
		ArraySh arr;
		arr=new ArraySh(maxSize);
		for (int i = 0; i < maxSize; i++) {
			long n=(long) (Math.random()*99);
			arr.insert(n);
		}
		arr.display();
		arr.shellSort();
		arr.display();
	}
}
