public class PersonQueueNodeImpl implements PersonQueueNode {
    private Person person;
    private PersonQueueNode next;
    
    public PersonQueueNodeImpl(Person person) {
        this.person = person;
        next = null;
    }
    
    public Person getPerson() {
        return person;
    }
    
    public void setNext(PersonQueueNode node) {
        next = node;
    }
    
    public PersonQueueNode getNext() {
        return next;
    }
}