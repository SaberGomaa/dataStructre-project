package My project;
  
class Node {
    char value;
    Node next;
    Node previous;
Node(char value) {
        this.value = value;
}
}
class DoubleL {
    Node first = null;
    Node last = null;
public void add(int index, char value) {
        Node newNode = new Node(value);
        if (index == 0) {
            if (first == null) {
                newNode.next = first;
                first = newNode;
            }
            else {
                first.previous = newNode;
                newNode.next = first;
                first = newNode;
            }
            last = newNode;
        }
        else {
            Node i = first;
            for (int count = 0; count < index - 1; count++) {
                i = i.next;
            }
            if (i.next == null) {
                newNode.next = i.next;
                i.next = newNode;
                newNode.previous = i;
            }
            else {
                Node j = i.next;
                newNode.next = i.next;
                i.next = newNode;
                newNode.previous = j.previous;
                j.previous = newNode;
            }
        }
    }
public void delete(int index) {
        Node i = first;
        if (index == 0) {
            first.next.previous = null;
            first = first.next;
        }
        else {
            for (int count = 0; count < index - 1; count++) {
                i = i.next;
            }
            if (i.next.next == null) {
                
                i.next=i.next.next;
                last=i;
            }
            else {    
                i.next=i.next.next;
                i.next.previous=i.next.next.previous;
            }
        }
}
public void display() {
        Node i = first;
        while (i != null) {
            System.out.print(i.value + "  ");
            i = i.next;
        }
        System.out.println();
}
}
public class DoubleLinked {
    public static void main(String[] args) {
        DoubleL l = new DoubleL();
        l.add(0, 'a');
        l.add(1, 'h');
        l.add(2, 'm');
        l.add(3, 'e');
        l.add(4, 'd');
        l.display();
        l.delete(0);
        l.display();
    }
}
