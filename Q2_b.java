class dll{
    dll prev;
    int info;
    dll next;

    dll(){
        prev = null;
        info = 0;
        next = null;
    }

    dll(int info){
        prev = null;
        this.info = info;
        next = null;
    }

    void traverse(){
        for(dll traverse = this; traverse!=null; traverse=traverse.next){
            System.out.println(traverse.info);
        }
    }

    void appendAfter(dll newNode){
        dll traverse = this;
        int afterData = traverse.info;

        for(; traverse!=null; traverse=traverse.next){
            if(newNode.info>traverse.info){
                afterData = traverse.info;
            }
        }

        for(traverse = this ; traverse.info!=afterData ; prev=traverse, traverse=traverse.next){}

        // Update next pointer for new node
        newNode.next=traverse.next;

        // Update prev pointer for new node
        newNode.prev=traverse;

        // Update next pointer for the node before new node
        traverse.next=newNode;
    }
}

class Q2_b {
    public static void main(String[] args){
        dll first = new dll(10);
        dll n1 = new dll(30);
        dll n2 = new dll(20);

        first.appendAfter(n1);
        first.appendAfter(n2);
        first.traverse();
    }
}