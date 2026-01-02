package D_LinkedLists;

public class demo {
    static class node{
        int data;
        node next;

        node(int value){
            data=value;
            next=null;
        }
    }
    static node head;
    static void addElement(int value){
        node newNode=new node(value);
        newNode.next=head;
        head=newNode;
    }
    static void printList(){
        node p=head;
        System.out.print("[");
        while(p!=null){
            System.out.print(" "+p.data+" ");
            p=p.next;
        }
        System.out.print("]");

    }

    public static void main(String[] args) {
        demo.addElement(10);
        demo.addElement(20);
        demo.printList();
    }
}
