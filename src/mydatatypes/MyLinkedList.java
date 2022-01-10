package mydatatypes;

import java.util.Arrays;

public class MyLinkedList<T> {
    private Node<T> head;;
    private Node<T> end;
    private int size;

    public void add(T element) {
        if(head == null) {
            head = new Node(null, element, null);
            end = head;
        }
        else {
            Node<T> temp = end;
            end = new Node<>(temp, element, null);
            temp.setNext(end);
        }
        size += 1;
    }

    public T get(int index) {
        if(index >= size) {
            throw new IllegalArgumentException();
        }
        Node<T> temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp.getValue();
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        Object[] result = new Object[size];
        int idx = 0;
        Node<T> temp = head;
        while(temp != null) {
            result[idx++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }

    public void remove(int index) {
        if(index >= size) {
            throw new NullPointerException();
        }
        if(index == 0) {;
            head.getNext().setPrev(null);
            size--;
            return;
        }

        if(index == size - 1) {
            end.getPrev().setNext(null);
            size--;
            return;
        }

        int currentIndex = 0;
        Node<T> temp = head;

        while(temp != null) {
            if(currentIndex == index) {
                Node<T> prev = temp.getPrev();
                Node<T> next = temp.getNext();
                prev.setNext(temp.getNext());
                next.setPrev(temp.getPrev());
                size--;
                return;
            }
            temp = temp.getNext();
            currentIndex++;
        }
    }

    public static class Node<T> {
        private Node<T> prev;
        private Node<T> next;
        private T value;

        Node(Node next, T value) {
            this.next = next;
            this.value = value;
        }
        Node(Node prev, T value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }
}
