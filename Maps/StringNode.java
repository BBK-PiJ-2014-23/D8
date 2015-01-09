public class StringNode {
    int key;
    String name;
    StringNode next;
    
    public StringNode(int key, String name) {
        this.key = key;
        this.name = name;
        this.next = null;
    }
    
    public int getKey() {
        return key;
    }
    
    public String getName() {
        return name;
    }
    
    public void setNext(StringNode next) {
        this.next = next;
    }
    
    public StringNode getNext() {
        return next;
    }
}