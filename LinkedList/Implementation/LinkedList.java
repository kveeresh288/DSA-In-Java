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
    static int size=0;
    void addFirst(int data){
         //step1 create a new Node 
         Node newNode=new Node(data);
         size++;
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
        size++;
        if(Tail==null){
            Head=Tail=newNode;
            return;
        }
        Tail.next=newNode;
        Tail=newNode;
    }
    public void addMiddle(int idx,int data){
        if(idx<0)return;
        Node newNode = new Node(data);
        if(Head==null||idx==0){
            addFirst(data);
            return;
        }
        //idx%=size;
        if(idx>=size){
            addLast(data);
            return;
        }
        //size++;
        Node temp=Head;
        int i=0;
        while(temp!=null&&i<idx-1){    
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
}
//delete first 
public void deleteFirst(){
    if(Head==null){
        System.out.println("The list is empty: ");
        return ;
    }
    System.out.println("Deleted: "+Head.data);
    Head=Head.next;
    if(Head==null){
        Tail=null;
    }
    size--;
}
//delete last 
public void deleteLast(){
    if(Head==null){
        System.out.println("The list is empty: ");
        return ;
    }
    size--;
    if(Head==Tail){
        System.out.println("Deleted: " + Head.data);
        Head=Tail=null;
        return;
    }
    Node t=Head;
    while(t!=null&&t.next!=Tail){
        t=t.next;
    }
    System.out.println("Deleted: " + Tail.data);
    Tail=t;
    t.next=null;

}
//delete middle 
public void deleteAt(int idx){
    if(idx <0 || idx>=size){
        System.out.println("Index out of bound:"+ idx + "for Len "+size);
        return;
    } 
    if(idx==0){
        deleteFirst();
        return;
    }
    if(idx==size-1){
        deleteLast();
        return;
    }
    
    int i=0;
    Node temp=Head;
    while(temp!=null&&i<idx-1){
        temp=temp.next;
        i++;
    }
    temp.next=temp.next.next;
    size--;
}

//find mid idx of linked list 
public int findMid(){
    //Node i=Head;
    if(Head==null){
        System.out.println("List is Empty: ");
        return -1;
    }
    int mid=0;
    Node Fast=Head;
    while(Fast!=null&&Fast.next!=null){
        Fast=Fast.next.next;
        mid++;
    }
    return mid;
}
//reverse linked list 
public void reverse(){
    if(Head==null||Head.next==null)return;
    
    Node Prev=null;
    Node Cur=Head;
    Tail=Head;
    while(Cur!=null){
        Node Next=Cur.next;
        Cur.next=Prev;
        Prev=Cur;
        Cur=Next;
    }
   
    Head=Prev;
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
        ll.addMiddle(4, 68);
        ll.print();
        System.out.println("Length of Linked List is : "+ll.size);
        System.out.println(size);

    }
}