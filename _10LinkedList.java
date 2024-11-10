//                                     SESSION-50 TO 52
//                                     1. SINGLE LINKED LIST
// creation of linked list by program
// class Node
// {
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//     }
// }
// class LinkedList{
//     Node start;
//     void traverse(){
//         Node ptr=start;
//         while(ptr!=null){
//             System.out.println(ptr.data);
//             ptr=ptr.next;
//         }
//     }
// }
// class Test{
//     public static void main(String[] args) {
//         LinkedList l=new LinkedList();
//         Node n1=new Node(10);
//         Node n2=new Node(20);
//         Node n3=new Node(30);
//         l.start=n1;
//         n1.next=n2;
//         n2.next=n3;
//         l.traverse();
//     }
// }

// by taking input from user
// import java.util.Scanner;
// class Node
// {
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//     }
// }
// class LinkedList{
//     Node start;
//     void traverse(){
//         Node ptr=start;
//         while(ptr!=null){
//             System.out.println(ptr.data);
//             ptr=ptr.next;
//         }
//     }
//     void createNode(){
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter data: ");
//         int data=s.nextInt();
//         Node n1=new Node(data);
//         if (start==null) {
//             start=n1;
//         } else {
//             Node ptr=start;
//             while (ptr.next!=null) {
//                 ptr=ptr.next;
//             }
//             ptr.next=n1;
//         }
//     }
// }

// class Test{
//     public static void main(String[] args) {
//         LinkedList l=new LinkedList();
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter number of nodes: ");
//         int n=s.nextInt();
//         for(int i=0;i<n;i++)
//             l.createNode();
//         l.traverse();
//     }
// }

// insertion and deletion of node
// import java.util.Scanner;
// class Node
// {
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//     }
// }
// class LinkedList{
//     Node start;
//     void traverse(){
//         Node ptr=start;
//         while(ptr!=null){
//             System.out.println(ptr.data);
//             ptr=ptr.next;
//         }
//     }
//     void createNode(){
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter data: ");
//         int data=s.nextInt();
//         Node n1=new Node(data);
//         if (start==null) {
//             start=n1;
//         } else {
//             Node ptr=start;
//             while (ptr.next!=null) {
//                 ptr=ptr.next;
//             }
//             ptr.next=n1;
//         }
//     }
//     int countNodes(){
//         int count=0;
//         Node ptr=start;
//         while (ptr!=null) {
//             count ++;
//             ptr=ptr.next;
//         }
//         return count;
//     }
//     void insertion(){
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter position: ");
//         int pos=s.nextInt();
//         int n=countNodes();
//         if (pos<=0 || pos>n+1) {
//             System.out.println("invalid position: ");
//         } else {
//             System.out.print("enter data: ");
//             int data=s.nextInt();
//             Node n1=new Node(data);
//             if (pos==1) {
//                 n1.next=start;
//                 start=n1;
//             } else {
//                 Node ptr=start;
//                 for(int i=1;i<pos-1;i++)
//                     ptr=ptr.next;
//                 n1.next=ptr.next;
//                 ptr.next=n1;
//             }
//         }
//     }
//     void deletion()
//     {
//       Scanner s=new Scanner(System.in);
//         System.out.print("enter position: ");
//         int pos=s.nextInt();
//         int n=countNodes();
//         if (pos>n || pos<=0) 
//             System.out.println("invalid position: ");   
//         else{
//             if (pos==1) {
//                 start=start.next;
//             } else {
//                 Node ptr=start;
//                 for(int i=1;i<pos-1;i++)
//                     ptr=ptr.next;
//                 ptr.next=ptr.next.next;
//             }
//         }
//     }
// }

// class Test{
//     public static void main(String[] args) {
//         LinkedList l=new LinkedList();
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter number of nodes: ");
//         int n=s.nextInt();
//         for(int i=0;i<n;i++)
//             l.createNode();
//         l.traverse();
//         l.insertion();
//         l.traverse();
//         l.deletion();
//         l.traverse();
//     }
// }

//                                       SESSION-53
//                                       2. DOUBLE LINKED LIST
// import java.util.Scanner;
// class Node
// {
//     int data;
//     Node next;
//     Node prev;
//     Node(int data){
//         this.data=data;
//     }
// }
// class LinkedList{
//     Node start;
//     void forwordTraverse(){
//         Node ptr=start;
//         while(ptr!=null){
//             System.out.println(ptr.data);
//             ptr=ptr.next;
//         }
//     }
//     void backwordTraverse(){
//         Node ptr=start;
//         while (ptr.next!=null) {
//             ptr=ptr.next;
//         }
//         while (ptr!=null) {
//             System.out.println(ptr.data);
//             ptr=ptr.prev;
//         }
//     }
//     void createNode(){
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter data: ");
//         int data=s.nextInt();
//         Node n1=new Node(data);
//         if (start==null) {
//             start=n1;
//         } else {
//             Node ptr=start;
//             while (ptr.next!=null) {
//                 ptr=ptr.next;
//             }
//             ptr.next=n1;
//             n1.prev=ptr;
//         }
//     }
//     int countNodes(){
//         int count=0;
//         Node ptr=start;
//         while (ptr!=null) {
//             count ++;
//             ptr=ptr.next;
//         }
//         return count;
//     }
//     void insertion(){
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter position: ");
//         int pos=s.nextInt();
//         int n=countNodes();
//         if (pos<=0 || pos>n+1) {
//             System.out.println("invalid position: ");
//         } else {
//             System.out.print("enter data: ");
//             int data=s.nextInt();
//             Node n1=new Node(data);
//             if (pos==1) {
//                 n1.next=start;
//                 start.prev=n1;
//                 start=n1;
//             } else {
//                 Node ptr=start;
//                 for(int i=1;i<pos-1;i++)
//                     ptr=ptr.next;
//                 n1.prev=ptr;
//                 n1.next=ptr.next;
//                 ptr.next.prev=n1;
//                 ptr.next=n1;
//             }
//         }
//     }
//     void deletion()
//     {
//       Scanner s=new Scanner(System.in);
//         System.out.print("enter position: ");
//         int pos=s.nextInt();
//         int n=countNodes();
//         if (pos>n || pos<=0) 
//             System.out.println("invalid position: ");   
//         else{
//             if (pos==1) {
//                  start.next.prev=null;
//                 start=start.next;
//             } else {
//                 Node ptr=start;
//                 for(int i=1;i<pos-1;i++)
//                     ptr=ptr.next;
//                 ptr.next=ptr.next.next;
//             }
//         }
//     }
// }

// class Test{
//     public static void main(String[] args) {
//         LinkedList l=new LinkedList();
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter number of nodes: ");
//         int n=s.nextInt();
//         for(int i=0;i<n;i++)
//             l.createNode();
//         l.forwordTraverse();
//         l.backwordTraverse();       
//        // l.insertion();
//         l.deletion();
//         l.forwordTraverse();
//     }
// }

//                                               SESSION-54
//                                       DOUBLE CIRCULAR LINKED LIST
// import java.util.Scanner;
// class Node
// {
//     int data;
//     Node next;
//     Node prev;
//     Node(int data){
//         this.data=data;
//     }
// }
// class LinkedList{
//     Node start;
//     void forwordTraverse(){
//         Node ptr=start;
//         if (start==null) {
//             System.out.println("Linked List is empty");
//             return;
//         }
//         do{
//             System.out.println(ptr.data);
//             ptr=ptr.next;
//         }while(ptr!=start);
//     }
//     void backwordTraverse(){
//         Node ptr=start.prev;
//         do{
//             System.out.println(ptr.data);
//             ptr=ptr.prev;
//         } while (ptr!=start.prev);
//     }
//     void createNode(){
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter data: ");
//         int data=s.nextInt();
//         Node n1=new Node(data);
//         if (start==null) {
//             start=n1;
//             start.prev=start;
//             start.next=start;
//         } else {
//             n1.prev=start.prev;
//             n1.next=start;
//             start.prev.next=n1;
//             start.prev=n1;
//         }
//     }
//     int countNodes(){
//         int count=0;
//         Node ptr=start;
//         do{
//             count ++;
//             ptr=ptr.next;
//         }while (ptr!=start);
//         return count;
//     }
//     void insertion(){
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter position: ");
//         int pos=s.nextInt();
//         int n=countNodes();
//         if (pos<=0 || pos>n+1) {
//             System.out.println("invalid position: ");
//         } else {
//             System.out.print("enter data: ");
//             int data=s.nextInt();
//             Node n1=new Node(data);
//             if (pos==1) {
//                 n1.next=start;
//                 n1.prev=start.prev;
//                 start.prev.next=n1;
//                 start.prev=n1;
//                 start=n1;
//             } else if(pos==n) {           // to insert at last position
//                 n1.prev=start.prev;
//                 n1.next=start;
//                 start.prev.next=n1;
//                 start.prev=n1;
//             }
//             else{                       // we can also insert last position by this
//                 Node ptr=start;
//                 for(int i=1;i<pos-1;i++)
//                     ptr=ptr.next;
//                 n1.prev=ptr;
//                 n1.next=ptr.next;
//                 ptr.next.prev=n1;
//                 ptr.next=n1;
//             }
//         }
//     }
//     void deletion()
//     {
//       Scanner s=new Scanner(System.in);
//         System.out.print("enter position: ");
//         int pos=s.nextInt();
//         int n=countNodes();
//         if (pos>n || pos<=0) 
//             System.out.println("invalid position: ");   
//         else{
//             if (pos==1) {
//                 start.prev.next=start.next;
//                 start.next.prev=start.prev;
//                 start=start.next;

//             } else {
//                 Node ptr=start;
//                 for(int i=1;i<pos-1;i++)
//                     ptr=ptr.next;
//                 ptr.next=ptr.next.next;
//             }
//         }
//     }
// }

// class Test{
//     public static void main(String[] args) {
//         LinkedList l=new LinkedList();
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter number of nodes: ");
//         int n=s.nextInt();
//         for(int i=0;i<n;i++)
//             l.createNode();
//         l.forwordTraverse();
//         l.insertion();
//         l.forwordTraverse();
//         // System.out.println(l.countNodes());
//         l.deletion();
//         l.forwordTraverse();
//     }
// }

