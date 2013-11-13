package POS;

import java.util.Iterator;


public class LinkedList<T> implements Iterator<T>  {
        Node front,rear;
        
        public LinkedList() {
                front = null;
                rear = null;
        }

        @Override
        public boolean hasNext() {
                Node next = null;

                if(!isEmpty()) {
                        return true;
                } 
                        return next!=rear;
                
                
        }

        @Override
        public T next() {
               Node<T> next = rear;
        	return (T)next;
        }

        @Override
        public void remove() {
                // TODO Auto-generated method stub
                
        }
        
        public boolean isEmpty() {
                return front==null;
        }
}