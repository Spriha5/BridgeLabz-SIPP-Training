package Day2_StackQueue;
import java.util.*;
 class QueueStack {
	

	    Stack<Integer> in = new Stack<>();
	    Stack<Integer> out = new Stack<>();

	    void enqueue(int x) {
	        in.push(x);
	    }

	    int dequeue() {
	        if (out.isEmpty()) {
	            while (!in.isEmpty())
	                out.push(in.pop());
	        }
	        if (out.isEmpty())
	            return -1;
	        return out.pop();
	    }
	}
 public class QueueUsingStack{
 public static void main(String[] args) {
	        QueueStack qu = new QueueStack();
	        qu.enqueue(4);
	        qu.enqueue(7);
	        qu.enqueue(8);
	        System.out.println(qu.dequeue());
	        
	        qu.enqueue(9);
	        System.out.println(qu.dequeue());
	    }
	}

