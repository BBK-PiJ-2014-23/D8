public class Person {
    private String name;
    private int age;
    private Person next;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.next = null;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setNext(Person person) {
        next = person;
    }
    
    public Person getNext() {
        return next;
    }
}