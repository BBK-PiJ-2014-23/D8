/**
 * Map from integer to Strings
 */
public class SimpleMapImpl implements SimpleMap {
    StringNode first;

    public SimpleMapImpl() {
        first = null;
    }

    /**
     * Puts a new String in the map.
     *
     * If the key is already in the map, nothing is done.
     */
    public void put(int key, String name) {
        StringNode iterator = first;
        while (iterator.getNext().getKey() != key) {
            iterator = iterator.getNext();
        }

        if (iterator.getNext() == null) {
            iterator.setNext(new StringNode(name));
        }
    }

    /**
     * Returns the name associated with that key,
     * or null if there is none.
     */
    public String get(int key) {
        StringNode iterator = first;
        while (iterator != null && iterator.getKey() != key) {
            iterator = iterator.getNext();
        }

        if (iterator == null) {
            return null;
        } else {
            return iterator.getName();
        }
    }

    /**
     * Removes a name from the map. Future calls to get(key)
     * will return null for this key unless another
     * name is added with the same key.
    }
     */
    public void remove(int key) {
        StringNode iterator = first;
        while (iterator.getNext() != null && iterator.getNext().getKey() != key) {
            iterator = iterator.getNext();
        }

        if (iterator.getNext() != null) {
            iterator.setNext(iterator.getNext().getNext());
        }
    }

    /**
     * Returns true if there are no workers in the map,
     * false otherwise
     */
    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
    }
}

