public class PersonQueueImpl implements PersonQueue {
    Person[] array;
    
    public PersonQueueImpl() {
        array = new Person[100];
    }
    
    public void insert(Person person) {
        // in my super market there is no space for a queue of 100 so we are on the safe side.
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = person;
    }
    
    public Person retrieve() {
        int iterator = array.length - 1;
        while (iterator > 0 && array[iterator] == null) {
            iterator--;
        }
        Person retrieved = array[iterator];
        array[iterator] = null;
        return retrieved;
    }
}