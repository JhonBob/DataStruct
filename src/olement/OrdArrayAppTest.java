package olement;

public class OrdArrayAppTest {
	static int maxSize=100;
	static OrdArrayApp arr;
	
	public static void run(){
		arr=new OrdArrayApp(maxSize);
		arr.insert(20);
		arr.insert(5);
		arr.insert(10);
		arr.insert(50);
		arr.insert(30);
		arr.insert(40);
		arr.display();
		System.out.println("’“µΩ£∫"+arr.getValue(40));
		arr.display();
		}
	
	
}
