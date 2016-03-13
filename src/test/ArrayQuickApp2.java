package test;

import element.ArrayQuick2;

public class ArrayQuickApp2 {
	public static void run(){
		int maxSize=16;
		ArrayQuick2 arr;
		arr=new ArrayQuick2(maxSize);
		for (int i = 0; i < maxSize; i++) {
			long n=(long) (Math.random()*99);
			arr.insert(n);
		}
		arr.display();
		arr.quickSort();//三项数据取中划分
		arr.display();
	}
}
