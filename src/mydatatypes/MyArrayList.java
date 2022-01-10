package mydatatypes;

import java.util.Arrays;

public class MyArrayList<E> {
    private final int  DEFAULT_CAPACITY = 10;
    private int size;
    private E[] array;

    public MyArrayList() {
        array = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyArrayList(int size) {
        this.size = size;
        array = (E[]) new Object[size];
    }

    public void add(E e) {
        if(array.length - 1 == size){
            grow( (int) Math.round(size * 1.5));
        }
        array[size] = e;
        size++;
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
}
