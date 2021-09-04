package My project;

 class node {
    public char value;
    public node next;
    node(char value) {
            this.value=value;
    }
}
class LinkedList {
    public node head = null;
public void display() {
        node i = head;
        while (i != null) {
            System.out.print(i.value + " ");
            i = i.next;
        }
        System.out.println();
}
public void search(char value) {
        node i = head;
        while (i != null) {
            if(value==i.value)
            {
                System.out.println("found");
                return;
            }
            i = i.next;
        }
         System.out.println("Not Found");
}
public void add(int index, char value) {
        node newNode = new node(value);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        }
        else {
            node i = head;
            for (int count = 0; count < index - 1; count++) {
                i = i.next;
            }
            newNode.next = i.next;
            i.next = newNode;
        }
}
public void delete(int index) {
        node i = head;
        for (int count = 0; count < index - 1; count++) {
            i = i.next;
        }
        node j = i.next;
        i.next = j.next;
}
}
public class linked {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(0, 'a');
        l.add(1, 'h');
        l.add(2, 'm');
        l.add(3, 'e');
        l.add(4, 'd');
        l.add(5, 'k');
        l.add(6, 'f');
        l.display();
        l.add(2, 'x');
        l.display();
        l.delete(5);
        l.display();
        l.search('f');
        l.search('k');        
}
}
