# iterator
Iterator Group Team Project

For the basic functionality of an iterator, the generic interface MyIterator <E> is provided:

public interface MyIterator<E> {
 
  //true if the iteration has more elements   public boolean hasNext();
 
  //returns the next element in the interation – requires hasNext()!   public E getNext();
 
}

Create the two generic classes QueueLinked <E> and QueueArray <E>, which have different internal implementations of a queue (queue). Furthermore, each of these two classes should also provide an iterator according to the above interface. The public interface of both classes is:

//default constructor for creating an empty queue public Queue? () //? is a wildcard for second part of classname
 
//inserts item at the end of the queue public void enqueue(E item)
 
//returns the head of the queue and deletes it from the queue; //returns null if queue is empty public T dequeue()
 
//returns the number of elements in the queue public int size()
 
//test if queue is empty public boolean isEmpty()
 
//returns a String-representation of this queue as //[item1, item2, ..., itemn] with item1 as the top item  //and itemn as the last inserted item public String toString ()
 
//returns an iterator for traversing the queue public MyIterator<E> getIterato


Class QueueLinked<E>: 
internally this is to implement with a simply linked list. Thus, the necessary operations are to be realized by means of pointers to linked nodes.

Klasse QueueArray<E>: internally this is to be implemented with an ArrayList. In this variant, the necessary operations are to be implemented using methods of class ArrayList (add, remove, ...), although no iterator of ArrayList may be used.

Iterators: the iterators to the above classes can be implemented as private inner classes. Thus, a use of the special internal data structure is possible in each case.

Demo program QueueWithIterator: this demo program has to test the correct functionality of the different methods. In particular, the iterator should also be used. (For example, in a queue for integers, it can be determined which values are from 1 to 10000 (or other limits) and the queue should already contain many values (> 10000).)

Time comparison of the two queue variants: first a certain number (for example 10000) is inserted into the queue. This is followed by further operations (e.g., 1000000), randomly determining whether to insert or remove (about 50% each). The total time for all these further operations (not the initial inserts) is to be compared for both queue variants. Use System.currentTimeMillis (), which returns the current time as long in milliseconds.

Good Luck!
