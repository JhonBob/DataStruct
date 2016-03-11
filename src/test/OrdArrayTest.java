package test;

import element.OrdArray;

public class OrdArrayTest {
	
	static int maxSize=100;
	private static OrdArray arr;
	
	public OrdArrayTest(){}
	
	public static void run(){
		arr=new OrdArray(maxSize);
		
		//插入时自动排序
		arr.insert(77);
		arr.insert(23);
		arr.insert(44);
		arr.insert(25);
		arr.insert(86);
		
		int searchKey=25;
		if(arr.find(searchKey)!=arr.size())
			System.out.println("找到"+searchKey);
		else
			System.out.println("没有找到"+searchKey);
		
		
		arr.display();
		arr.delete(44);
		arr.delete(86);
		arr.display();
		
	}
	
	
}
