//public class Collection05 {
//    public static void main(String[] args) {
//        Node jack = new Node("jack");
//        Node tom = new Node("tom");
//        Node zn = new Node("zn");
//        Node newNode = new Node("new");
//
//        jack.next = tom;
//        tom.next = zn;
//        zn.pre = tom;
//        tom.pre = jack;
//
//        newNode.next = zn;
//        newNode.pre = tom;
//        zn.pre = newNode;
//        tom.next = newNode;
//
//
//        Node first = jack;
//        Node last = zn;
//
//        while (true) {
//            if (first == null) {
//                break;
//            }
//            System.out.println(first);
//            first = first.next;
//        }
//
//        while (true) {
//            if (last == null) {
//                break;
//            }
//            System.out.println(last);
//            last = last.pre;
//        }
//    }
//}
//
//class Node {
//    public Object item;
//    public Node next;
//    public Node pre;
//
//    public Node(Object item) {
//        this.item = item;
//    }
//
//    @Override
//    public String toString() {
//        return "Node name = " + item;
//    }
//}
//
//
