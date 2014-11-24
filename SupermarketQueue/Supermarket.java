public class Supermarket {
    private PersonQueue queue;
    
    public Supermarket() {
        queue = new PersonQueueImpl();
    }
    
    public void addPerson(Person person) {
        PersonQueueNode node = new PersonQueueNodeImpl(person);
        queue.insert(node);
    }
    
    public void servePerson() {
        queue.retrieve();
    }
    
    public void printQueue() {
        PersonQueueNode current = queue.getFirst();
        while (current != null) {
            System.out.println(current.getPerson().getName());
            current = current.getNext();
        }
        System.out.println();
    }
    
    public static void main (String[] args) {
        Supermarket supermarket = new Supermarket();
        
        supermarket.addPerson(new Person("Stefan"));
        supermarket.addPerson(new Person("Hans"));
        supermarket.addPerson(new Person("Sepp"));
        supermarket.printQueue();
        supermarket.servePerson();
        supermarket.printQueue();
    }
}