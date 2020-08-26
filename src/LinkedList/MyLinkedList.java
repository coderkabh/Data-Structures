package LinkedList;

public class MyLinkedList<E> {
    Node<E> head;
    public static int size;

    public boolean isEmpty(){
        return head == null;
    }

    public void add(E data){
        Node<E> toAdd = new Node<E>(data);
        if (isEmpty()){
            head = toAdd;
            size++;
            return;
        }

        Node<E> temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = toAdd;
    }

    public static int getSize() {
        return size;
    }

    public void printList(){
        Node<E> temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    static class Node<E>{
        E data;
        Node<E> next;


        public Node(E data){
            this.data = data;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
            this.next = null;
        }

        public Node<E> getNext() {
            return next;
        }



    }

}
