package Lab3.problem3.models;

public interface MyCollection<E> extends Iterable<E> {
    int size();
    boolean contains(E e);
    boolean add(E e);
    boolean remove(E e);
    void clear();

    default boolean isEmpty() {
        return size() == 0;
    }
}