public class ListElement<T> {
    private T value;
    private ListElement<T> next;
    private ListElement<T> prev;

    ListElement(T value) {
        next = null;
        prev = null;
    }



    public ListElement<T> getNext() {
        return next;
    }

    public void setNext(ListElement<T> next) {
        this.next = next;
    }

    public ListElement<T> getPrev() {
        return prev;
    }

    public void setPrev(ListElement<T> prev) {
        this.prev = prev;
    }
    public T getValue() {
        return value;
    }
}
