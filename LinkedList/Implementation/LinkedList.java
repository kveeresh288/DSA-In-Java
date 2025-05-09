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
        if(Head==null){
            Head=new Node(data);
            Tail=Head;
            return;
        }
        //step1 create a new Node 
        Node newNode=new Node(data);
        //step 2 link newNode->next to the address of Head
        newNode.next=Head;
        //step 3 point newNode as a Head ,point head to the newNode
        Head=newNode;
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);

        System.out.println(Head.data);
        System.out.println(Tail.data);
        ll.addFirst(3);
        System.out.println(Head.data);
        System.out.println(Tail.data);

    }
}