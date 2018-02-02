import java.util.*;
public class PreorderTrav{
    public static void main(String[] args){
        ArrayList<Node<Integer>> nodeArr=new ArrayList<>();
        for(int i=0;i<20;i++){
            Node<Integer> node=new Node<>(i+1, null, null,null);
            nodeArr.add(node);
        }

        nodeArr.get(0).setPLR(null, nodeArr.get(1), nodeArr.get(2));
        nodeArr.get(1).setPLR(nodeArr.get(0), nodeArr.get(3), nodeArr.get(4));
        nodeArr.get(2).setPLR(nodeArr.get(0), nodeArr.get(5), nodeArr.get(6));
        nodeArr.get(3).setPLR(nodeArr.get(1), null, null);
        nodeArr.get(4).setPLR(nodeArr.get(1), nodeArr.get(7), nodeArr.get(8));
        nodeArr.get(5).setPLR(nodeArr.get(2), null, null);
        nodeArr.get(6).setPLR(nodeArr.get(2), nodeArr.get(9), nodeArr.get(10));
        nodeArr.get(7).setPLR(nodeArr.get(4), nodeArr.get(11), nodeArr.get(12));
        nodeArr.get(8).setPLR(nodeArr.get(4), nodeArr.get(13), nodeArr.get(14));
        nodeArr.get(9).setPLR(nodeArr.get(6), nodeArr.get(15), nodeArr.get(16));
        nodeArr.get(10).setPLR(nodeArr.get(6), nodeArr.get(17), null);
        nodeArr.get(11).setPLR(nodeArr.get(7), null, nodeArr.get(18));
        nodeArr.get(12).setPLR(nodeArr.get(7), null, null);
        nodeArr.get(13).setPLR(nodeArr.get(8), nodeArr.get(19), null);
        nodeArr.get(14).setPLR(nodeArr.get(8), null, null);
        nodeArr.get(15).setPLR(nodeArr.get(9), null, null);
        nodeArr.get(16).setPLR(nodeArr.get(9), null, null);
        nodeArr.get(17).setPLR(nodeArr.get(10), null, null);
        nodeArr.get(18).setPLR(nodeArr.get(11), null, null);
        nodeArr.get(19).setPLR(nodeArr.get(13), null, null);

        Node<Integer> node=nodeArr.get(0);
        while(true){
            while(node.getL()!=null){
                System.out.print(node.getVal()+" ");
                node=node.getL();
            }
            System.out.print(node.getVal()+" ");

            if(node.getR()!=null){
                node=node.getR();
            }else{
                
                while(node.getP()!=null&&(node.getP().getR()==null||node.getP().getR().equals(node))){
                    node=node.getP();
                }

                if(node.getP()!=null){
                    node=node.getP().getR();
                }else{
                    break;
                }
            }
        }
    }
}

class Node<T>{
    private T value;
    private Node<T> p;
    private Node<T> l;
    private Node<T> r;

    public Node(){
        this.value=null;
        this.p=null;
        this.l=null;
        this.r=null;
    }

    public Node(T value, Node<T>p, Node<T> l, Node<T> r){
        this.value=value;
        this.p=p;
        this.l=l;
        this.r=r;
    }

    public T getVal(){ return this.value;}
    public void setVal(T t){this.value=t;}

    public Node<T> getP(){return this.p;}
    public void setP(Node<T> node){this.p=node;}

    public Node<T> getL(){return this.l;}
    public void setL(Node<T> node){this.l=node;}

    public Node<T> getR(){return this.r;}
    public void setR(Node<T> node){this.r=node;}

    public void setPLR(Node<T> p,Node<T> l,Node<T> r){
        this.p=p;
        this.l=l;
        this.r=r;
    }
}