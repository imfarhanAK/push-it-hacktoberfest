/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueusinglinklist;

/**
 *
 * @author Malik Muneeb Shahid
 */
public class Queueusinglinklist {
 node front,rear;

    public Queueusinglinklist() {
        this.front = null;
        this.rear = null;
    }
 public void enqueue(int data){
     node temp = new node(data); 

		 
		if (rear == null) { 
			front = rear = temp; 
			 
		} 
 
		rear.next = temp; 
		rear = temp; 
                System.out.println("item "+data+" is enqueued");
 }
 public void dequeue(){
                     if (front == null) 
			return; 

		node temp = front; 
                System.out.println("item "+front.data+" is Dequeued");
		front = front.next; 
                
		if (front == null) 
			rear = null;  
 }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Queueusinglinklist l1=new Queueusinglinklist();  
      l1.dequeue();
     l1.enqueue(12);
     l1.dequeue();
     l1.enqueue(34);
     l1.enqueue(67);
     l1.dequeue();
     l1.enqueue(56);
     l1.enqueue(1);
    l1.enqueue(2);
    l1.dequeue();
    l1.dequeue();
        
        System.out.println("rear of queue is "+l1.rear.data);
         System.out.println("front is :"+l1.front.data);
    }
    
}
class node{
    int data;
    node next;

    public node(int data) {
        this.data = data;
        this.next = null;
    }
    
}
