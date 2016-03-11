package implement;

import element.Link;
//Á´±í½Ó¿Ú
public interface List {
	public <T> void insertFirst(T id);
	public boolean isEmpty();
	public <T> Link deleteFirst();
	public <T> Link find(T key);
	public <T> Link delete(T key);
	public void displayList();

}
