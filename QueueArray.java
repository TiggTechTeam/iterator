import java.util.ArrayList;

import MyQueue.Node;
public class QueueArray<E>{
	// Sollte die Implementierung duch die Inneren Klasse erfolgt werden (sihe ganz Unten)
	ArrayList list;
	private Object head;
	
	//default constructor for creating an empty queue
	public Queue? (){ //? is a wildcard for second part of classname
	list = new ArrayList();		
	}
	
	//inserts item at the end of the queue
	//https://stackoverflow.com/questions/33185505/add-items-to-the-end-of-a-queue
	public <E> void enqueue(MyIterator<E> head,E item) {
		MyIterator<E> last = head;
		    while (last.next != null) {
		        last = (MyIterator<E>) last.next;	
	}
		    last.next = new Queue?<E> (item, null);
	}


	//returns the head of the queue and deletes it from the queue;
	//returns null if queue is empty
	public E dequeue() {
			if(head==null){
				return null;
			}else{
				Node help = head;
				head = head.next;
				return help.data;
			}
	}
	
	//returns the number of elements in the queue
	public int size() {
		return list.size();
	}

	//test if queue is empty
	public boolean isEmpty() {
		list.isEmpty();
	}

	//returns a String-representation of this queue as
	//[item1, item2, ..., itemn] with item1 as the top item 
	//and itemn as the last inserted item
	// ???????
	public String toString () {		
		String out="";
		for(int i=0;i<list.size();i++){
			if(list.get(i)!=null){
				if(i==list.size()-1){
					out = out + list.get(i);
					break;
				}
				out = out + list.get(i)+", ";
			}
		}
		return "["+out+"]";
	}

	//returns an iterator for traversing the queue
	public MyIterator<E> getIterator(){		
	
	}

	private class MyIteratorX<E> implements MyIterator<E>{

	@Override
	public boolean hasNextint(int objectInBox) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E getNext() {
		// TODO Auto-generated method stub
		return null;
		
	}
}
}
