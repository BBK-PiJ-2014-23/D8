public class PersonQueueImpl implements PersonQueue {
    Person first;

    public PersonQueueImpl() {
        first = null;
    }

    public void insert(Person person) {
        if (first == null) {
            first = person;
        } else if (first.getNext() == null) {
            if (person.getAge() < first.getAge()) {
                Person temp = first;
                first = person;
                first.setNext(temp);
            } else {
                first.setNext(person);
            }
        } else {
            Person iterator = first;
            while (iterator.getNext() != null && person.getAge() > iterator.getNext().getAge()) {
                iterator = iterator.getNext();
            }
            Person temp = iterator.getNext();
            iterator.setNext(person);
            iterator.getNext().setNext(temp);
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