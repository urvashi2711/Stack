import java.util.Scanner;
class Stack{
	int top=-1;
	int n=10;
	int a[]=new int[n];
	int i;
	Scanner sc=new Scanner(System.in);
	void push(){
		if(top==(n-1)){
			System.out.println("stack is overflow");
		}
		else{
			System.out.println("enter data");
			 i=sc.nextInt();
			top=top+1;
			a[top]=i;
			
			System.out.println("item inserted");
		}
	}
	void pop(){
		if(top==-1){
			System.out.println("stack is underflow");
		}
		else{
			top=top-1;
			System.out.println("item deleted");
		}
	}
	void display(){
		System.out.println("stacks items are:");
		for(int j=top;j>=0;j--){
			System.out.println(a[j]);
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