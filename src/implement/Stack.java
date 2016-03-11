package implement;

import element.Link;

public interface Stack<T> {
	public void push(T j);
	public  T pop();
	public  T peek();
	public boolean isEmpty();
	public boolean isFull();
}
