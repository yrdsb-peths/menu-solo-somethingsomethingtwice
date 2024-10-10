public class Stack<Type> {
    private Node first;
    private Node last;
    private class Node {
        private Type item;
        private Node next;
    
        public Node(Type item) {
            this.item = item;
        }
    
        public Node getNext() {
            return next;
        }
    
        public Type getItem() {
            return item;
        }
    
        public void setNext(Node next) {
            this.next = next;
        }
    }
    
    public void push(Type item) {
        Node node = new Node(item);
        node.setNext(first);
        if (first == null)
            last = node;
        first = node;
    }

    public Type pop() {
        Node removed = first;
        first = removed.getNext();
        if (isEmpty())
            last = null;
        return removed.getItem();
    }

    public Type peek() {
        return first.getItem();
    }
    
    public boolean isEmpty() {
        return first == null;
    }

    public void printItems() {
        for (Node n = first; n != null; n = n.getNext()) {
            System.out.print(n.getItem());
            if (n.getNext() != null)
                System.out.print(", ");
        }
        System.out.println();
    }

    public void pushBack(Type item) {
        last.setNext(new Node(item));
        last = last.getNext();
        last.setNext(null);
    }    
}