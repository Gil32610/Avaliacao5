package br.unicap.edi.dlld;

public class DoublyLinkedNode<T extends Comparable <T>> {
    private DoublyLinkedNode<T> previous;
    private DoublyLinkedNode<T> next;
    private T content;


    public DoublyLinkedNode(T content) {
        this.content = content;
    }

    public DoublyLinkedNode<T> getPrevious() {
        return this.previous;
    }
    public void setPrevious(DoublyLinkedNode<T> previous) {
        this.previous = previous;
    }
    public DoublyLinkedNode<T> getNext() {
        return this.next;
    }
    public void setNext(DoublyLinkedNode<T> next) {
        this.next = next;
    }
    public T getContent() {
        return this.content;
    }
    public void setContent(T content) {
        this.content = content;
    }



    
    
}
