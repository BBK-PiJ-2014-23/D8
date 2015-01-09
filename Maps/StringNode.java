public class StringNode {
    int key;
    String name;
    StringNode next;
    
    public StringNode(String name) {
        this.key = HashUtilities.shortHash(name.hashCode());
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