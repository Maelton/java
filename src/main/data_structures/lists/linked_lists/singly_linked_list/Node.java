package main.data_structures.lists.linked_lists.singly_linked_list;

import main.data_structures.lists.linked_lists.INode;

public class Node<T> implements INode<T> {
    
    private T data;
    private Node<T> next;
    
    public boolean equals(Object element) {
        return this.data == element || this.data.equals(element);
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return (String) this.getData();
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}