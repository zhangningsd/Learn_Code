@SuppressWarnings({"all"})
public class HashSetStruct {
    public static void main(String[] args) {
        //1.创建一个 Node 数组, 称为表
        Node[] table = new Node[16];
        Node john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack;   //挂载
        Node rose = new Node("rose", null);
        jack.next = rose;
        Node lucy = new Node("lucy", null);
        table[3] = lucy;
    }
}

class Node {
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}

