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
        
        supermarket.addPerson(new Person("Stefan", "Lada"));
        supermarket.addPerson(new Person("Hans", "Wada"));
        supermarket.addPerson(new Person("Sepp", "Jada"));

        System.out.println(supermarket.servePerson().getFirstName());
        System.out.println(supermarket.servePerson().getFirstName());
        System.out.println(supermarket.servePerson().getFirstName());
        System.out.println(supermarket.servePerson());

    }
}