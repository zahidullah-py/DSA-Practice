package zaid.code;

public class Main {
    public static void main(String[] args) {
        Stack s= new Stack(5);
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        s.push(25);
        s.display();
        System.out.println(" ");
        s.pop();
        s.display();

    }
}
