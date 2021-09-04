package My project;
  
class Stack {
    int top = -1;
    int[] arr = new int[30];
public void push(int value) {
        arr[++top] = value;
}
public int pop() {
        return arr[top--];
}
public boolean Isfull() {
        return top == 30;
}
public boolean IsEmpty() {
        return top == -1;
}
public int peek() {
        return arr[top];
}
public void display(){
        for(int i =0 ; i<=top; i++)
        {
            System.out.print(arr[i]+"  ");
        }
}
}
public class stack {
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.IsEmpty());
        s.push(4);
        s.push(15);
        s.push(40);
        s.push(14);
        s.push(21);
        s.push(94);
        s.push(28);
        s.push(41);
        s.push(10);
        s.display();
        System.out.println(s.IsEmpty());
        System.out.println();
        s.pop();
        System.out.println(s.peek());
        s.display();
    }
}
