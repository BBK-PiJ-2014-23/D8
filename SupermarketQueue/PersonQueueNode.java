public interface PersonQueueNode {
    /**
     * Returns the Person of the node.
     */
    Person getPerson();
    
    /**
     * Changes the next node of the node.
     */
    void setNext(PersonQueueNode node);
    
    /**
     * Returns the next node.
     */
    PersonQueueNode getNext();
}
