package My project;
class Nodetree {
 
    int value;
    Nodetree leftchild;
    Nodetree rightchild;
Nodetree(int value) {
        this.value = value;
}
}
class TreeOp {
    Nodetree root = null;
public void add(int value) {
        Nodetree n = new Nodetree(value);
        if (root == null) {
            root = n;
        }
        else {
            Nodetree i = root;
            Nodetree parent;
            while (true) {
                parent = i;
                if (value < i.value) {
                    i = i.leftchild;
                    if (i == null) {
                        parent.leftchild = n;
                        return;
                    }
                }
                else {
                    i = i.rightchild;
                    if (i == null) {
                    parent.rightchild = n;
                    return;
                    }
                }
            }
        }
}

public void Find(int value) {
        Nodetree i =root;        
        while(value!=i.value){
            if(value < i.value){
                i=i.leftchild;
            }
            else{
                i=i.rightchild;
            }  
            if(i==null){
                System.out.println("NotFound");
                return;
            }  
        }
        System.out.println("Found");
}       
public void inOrder(){
        printInOrer(root);
}
private void printInOrer(Nodetree root) {        
        if(root!=null){
            printInOrer(root.leftchild);
        }
}
}
public class Tree {
    public static void main(String[] args) {
        TreeOp t = new TreeOp();
        t.add(20);
        t.add(11);
        t.add(16);
        t.add(6);
        t.add(8);
        t.add(77);
        t.add(4);
        t.add(0);
        t.Find(4);
        t.Find(90);
    }
}