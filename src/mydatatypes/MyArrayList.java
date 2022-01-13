package mydatatypes;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements Iterable<E>{
    private final int  DEFAULT_CAPACITY = 10;
    private E[] array;
    private int size;

    public MyArrayList() {
        array = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyArrayList(int size) {
        array = (E[]) new Object[size];
        this.size = 0;
    }

    public void add(E e) {
        if(array.length - 1 == size){
            grow( (int) Math.round(size * 1.5));
        }
        array[size++] = e;
    }

    public Object get(int index) {
        if(index >= array.length)
            throw new IndexOutOfBoundsException();
        return array[index];
    }

    public void grow(int newCapacity) {
        if(array.length >= newCapacity)
            return;
        Object[] array2 = new Object[newCapacity];
        for(int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        this.array = (E[]) array2;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        if(array.length - 1 > size) {
            Object[] arrayToPrint = new Object[size];
            for(int i = 0; i < size; i++)
                arrayToPrint[i] = array[i];
            return Arrays.toString(arrayToPrint);
        }
        return Arrays.toString(array);
    }


    @Override
    public Iterator<E> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<E> {
        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public E next() {
            return array[currentIndex++];
        }
    }
}
