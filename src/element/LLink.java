package element;
//����ڵ�
public class LLink {
	//����
		public long dData;
		//ָ��
		public LLink next;
		
		public LLink(long d){
			dData=d;
		}
		
		public void displayLink(){
			System.out.print("["+dData+"]");
			
		}
}
