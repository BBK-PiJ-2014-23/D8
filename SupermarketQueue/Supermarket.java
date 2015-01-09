public class Supermarket {
    private PersonQueue queue;
    
    public Supermarket() {
        queue = new PersonQueueImpl();
    }
    
    public void addPerson(Person person) {
        queue.insert(person);
    }
    
    public Person servePerson() {
        return queue.retrieve();
    }
    
    public static void main (String[] args) {
        Supermarket supermarket = new Supermarket();
        
        supermarket.addPerson(new Person("Stefan"));
        supermarket.addPerson(new Person("Hans"));
        supermarket.addPerson(new Person("Sepp"));

        System.out.println(supermarket.servePerson().getName());
        System.out.println(supermarket.servePerson().getName());
        System.out.println(supermarket.servePerson().getName());
        System.out.println(supermarket.servePerson());

    }
}