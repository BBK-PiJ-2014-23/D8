public class PersonQueueImpl implements PersonQueue {
    Person first;
    
    public PersonQueueImpl() {
        first = null;
    }
    
    public void insert(Person person) {
        if (first == null) {
            first = person;
        } else {
            Person temp = first;
            first = person;
            first.setNext(temp);
        }
    }
    
    public Person retrieve() {
        Person delPerson = null;
        if (first != null && first.getNext() == null) {
            delPerson = first;
            first = null;
        } else if (first != null) {
            Person current = first;
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            delPerson = current.getNext();
            current.setNext(null);
        }
        return delPerson;
    }
}