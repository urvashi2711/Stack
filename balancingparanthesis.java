

import java.util.*;
class Balancingparanthesis{
	static boolean isvalid(String s){
		Stack<Character> stack=new Stack<Character>();
		for(char c: s.toCharArray()){
			if(c=='('|| c=='{' || c=='['){
				Stack.push(c);	
			}
			else{
				if(stack.isEmpty()){
					return false;
				}
				else{
					char top=stack.peek();
					if((c==')'&& top=='(')||(c=='}'&& top=='{')||(c==']'&& top=='[')){
						stack.pop();
					}
					else{
						return false;
					}
				}	
			}
		}
	return stack.isEmpty();
	}	


	public static void main(String[] args){	
		String s="{[{()}]}";
		isvalid 
	}

}	