public interface MyIterator<E>  {
  Object next = null;

//true if the iteration has more elements
  public boolean hasNextint(int objectInBox);

  //returns the next element in the interation – requires hasNext()!
  public E getNext();

}







