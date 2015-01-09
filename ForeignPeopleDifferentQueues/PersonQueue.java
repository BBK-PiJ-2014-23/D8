public interface PersonQueue {
    /**
     * Inserts an element at the beginning of the queue.
     */
    void insert(Person person);

    /**
     * Removes an element from the end of the queue.
     */
    Person retrieve();
}
