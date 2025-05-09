//package LinkedList.implimentation;
import java.util.*;
public class LinkedList{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node Head;
    static Node Tail;

    void addFirst(int data){
         //step1 create a new Node 
         Node newNode=new Node(data);
        if(Head==null){
            Head=Tail=newNode;
            return;
        }
        //step 2 link newNode->next to the address of Head
        newNode.next=Head;
        //step 3 point newNode as a Head ,point head to the newNode
        Head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(Tail==null){
            Head=Tail=newNode;
            return;
        }
        Tail.next=newNode;
        Tail=newNode;
    }

    public void print(){
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int len(){
        int c=0;
        Node t=Head;
        while(t!=null){
            c++;
            t=t.next;
        }
        return c;
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        System.out.println("Length of Linked List is : "+ll.len());
        ll.print();
        ll.addFirst(10);
        ll.print();
        ll.addFirst(20);
        ll.print();
        // System.out.println(Head.data);
        // System.out.println(Tail.data);
        ll.addFirst(3);
        ll.print();
        ll.addLast(1);
        ll.addFirst(2);
        ll.print();
        ll.addLast(90);
        ll.print();
        ll.addFirst(100);
        ll.print();
        System.out.println("Length of Linked List is : "+ll.len());
    }
}