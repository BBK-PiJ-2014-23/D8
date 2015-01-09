public class Person {
    private String name;
    private Person next;
    
    public Person(String name) {
        this.name = name;
        this.next = null;
    }
    
    public String getName() {
        return name;
    }
    
    public void setNext(Person person) {
        next = person;
    }
    
    public Person getNext() {
        return next;
    }
}