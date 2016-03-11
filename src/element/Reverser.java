package element;

//×Ö·û·´×ª
public class Reverser {
	private String input;
	private String output;
	
	public Reverser(String in){
		input=in;
	}
	
	public String doRev(){
		int stackSize=input.length();
		StackY theStackY=new StackY(stackSize);
		for (int i = 0; i < input.length(); i++) {
			char ch=input.charAt(i);
			theStackY.push(ch);
		}
		output="";
		while(!theStackY.isEmpty()){
			char c=theStackY.pop();
			output=output+c;
		}
		return output;
	}

}
