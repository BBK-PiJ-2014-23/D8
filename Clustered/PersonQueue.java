public interface PersonQueue {
    /**
     * Returns the first node in the queue.
     */
    PersonQueueNode getFirst();

    /**
     * Inserts an element at the beginning of the queue.
     */
    void insert(PersonQueueNode node);

    /**
     * Removes an element from the end of the queue.
     */
    Person retrieve();

    /**
     * Returns the current size of the queue.
     */
    int size();
}
