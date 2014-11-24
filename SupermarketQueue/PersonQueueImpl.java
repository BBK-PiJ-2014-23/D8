public class PersonQueueImpl implements PersonQueue {
    PersonQueueNode first;
    
    public PersonQueueImpl() {
        first = null;
    }
    
    public PersonQueueNode getFirst() {
        return first;
    }
    
    public void insert(PersonQueueNode node) {
        if (size() == 0) {
            first = node;
        } else {
            PersonQueueNode temp = first;
            first = node;
            first.setNext(temp);
        }
    }
    
    public Person retrieve() {
        Person delPerson = null;
        if (first.getNext() == null) {
            delPerson = first.getPerson();
            first = null;
        } else {
            PersonQueueNode current = first;
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            delPerson = current.getNext().getPerson();
            current.setNext(null);
        }
        return delPerson;
    }
    
    public int size() {
        if (first == null) {
            return 0;
        } else {
            PersonQueueNode current = first;
            int counter = 1;
            while (current.getNext() != null) {
                counter++;
                current = current.getNext();
            }
            return counter;
        }
    }
}