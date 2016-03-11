package element;
//链表节点
public class LLink {
	//数据
		public long dData;
		//指针
		public LLink next;
		
		public LLink(long d){
			dData=d;
		}
		
		public void displayLink(){
			System.out.print("["+dData+"]");
			
		}
}
