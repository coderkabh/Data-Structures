package LinkedList;

import java.rmi.MarshalledObject;

public class MyLinkedList<E> {
    private Node<E> head = null;
    private int size = 0;

    private Node<E> getNode(int index){
        Node<E> response = head;

        for (int i = 0; i <  index; i++) {
            response = response.getNext();
        }
    return response;
    }

    void addFirst(E item){
        head = new Node<E>(item,head);
        size++;
    }

    void addAfter(Node<E> node,E item){
        node.next = new Node<>(item,node.next);
        size++;
    }

    void add(int index, E item){
            if(index > size || index < 0){
                throw new IndexOutOfBoundsException(Integer.toString(index));
            }
            else if(index == 0 ){
                addFirst(item);
            }
            else{
                Node<E> n = getNode(index-1);
                addAfter(n,item);
            }
    }

    public void add(E item){
        add(size,item);
    }

    private static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
            next = null;
        }
        public Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext(){
            return next;
        }
    }
}
