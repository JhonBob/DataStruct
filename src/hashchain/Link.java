package hashchain;

public class Link {
	private int iData;
	public Link next;
	public Link(int ii){
		iData=ii;
	}
	public  int getKey(){
		return iData;
	}
	
	public void displayLink(){
		System.out.print("["+iData+"]");
	}

}
