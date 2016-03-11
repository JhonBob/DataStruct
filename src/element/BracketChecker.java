package element;

//·ûºÅ¼ì²é
public class BracketChecker {

	private String input;
	public BracketChecker(String in){
		input=in;
	}
	
	public void cheak(){
		int stackSize=input.length();
		StackY theStack=new StackY(stackSize);
		for (int j = 0; j < input.length(); j++) {
			char ch=input.charAt(j);
			switch(ch){
			case '{':
			case '(':
			case '[':
				theStack.push(ch);
				break;
			case '}':
			case ')':
			case ']':
				if(!theStack.isEmpty()){
					char chx=theStack.pop();
					if((ch=='}' && chx!='{')|| (ch==']' && chx!='[')||
							(ch==')' && chx!='(')){
						System.out.println("Error"+ch+j);
					}
				}
				break;
			default:
				break;
			}
		}
		if(!theStack.isEmpty())System.out.println("Missing right");
	}
}
