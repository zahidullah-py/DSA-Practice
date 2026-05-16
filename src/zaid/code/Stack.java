package zaid.code;

public class Stack {
    int max_size;
    int top;
    int[] stack;

    //constructor
    public Stack(int n){
        max_size=n;
        top=-1;
        stack=new int[n];
    }
    public void push(int item){
        if (top== max_size-1){
            System.out.println("overflow");
            return;
        }
        top+=1;
        stack[top]=item;
    }
    public void display(){
        for (int i=0; i<stack.length; i++){
            System.out.print(stack[i]+ " ");
        }
    }
}
