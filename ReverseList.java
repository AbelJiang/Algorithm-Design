import java.util.ArrayList;

public class ReverseList{
    public static void main(String[] args){
        SinglyLinkedList<Integer> sll=new SinglyLinkedList<>(new Integer[]{1,2,3,4,5,6,7});
        sll.Reverse();
        System.out.println(sll.toString());
    }
}

class SinglyLinkedList<T>{
    private static class Node<T>{
        private T value;
        private Node<T> next;
        public Node(){
            this.value=null;
            this.next=null;
        }
        public Node(T value, Node<T> node){
            this.value=value;
            this.next=node;
        }
        
        public void setValue(T t){
            this.value=t;
        }

        public void setNext(Node<T> node){
            this.next=node;
        }

        public T getValue(){
            return this.value;
        }
    }

    private Node<T> Head=new Node<T>(null, null);

    public SinglyLinkedList(T[] input){
        for(T element:input){
            Node<T> node=new Node<>(element,Head.next);
            Head.next=node;
        }
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        Node<T> p=Head.next;
        while(p!=null){
            sb.append(p.getValue()+" ");
            p=p.next;
        }
        return sb.toString();
    }

    public void Reverse(){
        Node<T> p=Head.next.next;
        Node<T> q=p.next;
        Head.next.next=null;
        while(p.next!=null){
            p.next=Head.next;
            Head.next=p;
            p=q;
            q=q.next;
        }
        p.next=Head.next;
        Head.next=p;
    }
}
