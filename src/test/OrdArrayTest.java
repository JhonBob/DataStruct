package test;

import element.OrdArray;

public class OrdArrayTest {
	
	static int maxSize=100;
	private static OrdArray arr;
	
	public OrdArrayTest(){}
	
	public static void run(){
		arr=new OrdArray(maxSize);
		
		//����ʱ�Զ�����
		arr.insert(77);
		arr.insert(23);
		arr.insert(44);
		arr.insert(25);
		arr.insert(86);
		
		int searchKey=25;
		if(arr.find(searchKey)!=arr.size())
			System.out.println("�ҵ�"+searchKey);
		else
			System.out.println("û���ҵ�"+searchKey);
		
		
		arr.display();
		arr.delete(44);
		arr.delete(86);
		arr.display();
		
	}
	
	
}
