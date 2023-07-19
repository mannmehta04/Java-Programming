class node{
    int no;
    node next;

    node(){
        no = 0;
        next = null;
    }

    node(int no){
        this.no = no;
        next = null;
    }

    void appendData(node newNode){
        node traverse;
        for(traverse = this; traverse.next!=null; traverse=traverse.next){}
        traverse.next = newNode;
    }

    void traverse(){
        for(node traverse = this; traverse!=null; traverse=traverse.next){
            System.out.println(traverse.no);
        }
    }
}

public class linkedList {
    public static void main(String[] args){
        node first = new node(10);
        node n1 = new node(20);
        node n2 = new node(30);

        first.appendData(n1);
        first.appendData(n2);
        first.traverse();
    }
}
