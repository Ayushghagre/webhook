public class CreateList {  
    
    public class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
    
    public Node head = null;  
    public Node tail = null;  
  
    
    public void add(int data){  
        
        Node newNode = new Node(data);  
        //Checks if the list is empty.  
        if(head == null) {  
             
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            //tail will point to new node.  
            tail.next = newNode;  
            //New node will become new tail.  
            tail = newNode;  
            //Since, it is circular linked list tail will point to head.  
            tail.next = head;  
        }  
    }  
  
   
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            System.out.println("Nodes of the circular linked list: ");  
             do{  
               
                System.out.print(" "+ current.data);  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
  
    public static void main(String[] args) {  
        CreateList cl = new CreateList();  
        //Adds data to the list  
        cl.add(1);  
        cl.add(2);  
        cl.add(3);  
        cl.add(4);
        cl.add(5);
        cl.add(6);
        cl.add(7);
        cl.add(8);
       
        //Displays all the nodes present in the list  
        cl.display();  
    }  
}  
