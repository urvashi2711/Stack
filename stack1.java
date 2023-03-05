import java.util.Scanner;
class Stack1{
	Scanner sc=new Scanner(System.in);
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node top=null;
	void push(){
		System.out.println("enter data");
		int data=sc.nextInt();
		Node newnode=new Node(data);
		if(top==null){
			top=newnode;
		}	
		else{
			newnode.next=top;
			top=newnode;
		}
	}
	void pop(){
		if(top==null){
			System.out.println("stack is underflow");
		}
		else{
			top=top.next;
		}
	}
	void display(){
		Node temp=top;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		
		}
	}
}
class Main{
	public static void main(String[] args){
	int d,k;
	Scanner sc=new Scanner(System.in);
	Stack s=new Stack();
	do{
		System.out.println("enter 1 to push, 2 for pop and 3 for display");
		d=sc.nextInt();
		switch(d){
			case 1:
				s.push();
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.display();
				break;
		}
	System.out.println("enter 0 to do more operation on stack else press any key");
	k=sc.nextInt();
	}while(k==0);
	System.out.println("exit successfully");
}	
}