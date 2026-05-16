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
}
