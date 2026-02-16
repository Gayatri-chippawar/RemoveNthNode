package Linked_List;

public class RemoveNthnode {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){

        //step1:create new node
        Node newNode = new Node(data);
        size++;
        //Empty linkedList
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2:next node poiting to head
        newNode.next = head;

        //step3:head = newNode
        head = newNode;
    }

    public int getRemove(int  n){
        //to cal size manually
//        int sz =0;
//        Node temp = head;
//        while (temp!=null){
//            temp = temp.next;
//            sz++;
//        }

        if(n==size){
            head = head.next;
            return head.data;
        }
        int pos = (size-n+1);
        int i=1;
        Node prev = null;
        Node curr = head;
        while (i!=pos){
            prev = curr;
            curr = curr.next;
            i++;
        }
        prev.next =curr.next;
        return  curr.data;
    }
    public  void printList(){//O(n)
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveNthnode ll = new RemoveNthnode();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(7);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printList();
        int list = ll.getRemove(3);
        System.out.println(list+" is deleted");
        ll.printList();
    }

    public static class Pallindrome {
    }
}
