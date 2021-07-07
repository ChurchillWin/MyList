import java.lang.reflect.Array;
import java.net.Proxy;
import java.util.*;

public class MyList<T> {
    private int size;
    private ListElement<T> start = new ListElement<>(null);
    private ListElement<T> end = new ListElement<>(null);

    MyList() {
        size = 0;
        this.start.setPrev(null);
        this.end.setNext(null);
        start.setNext(start);
        end.setPrev(start);
    }

    @Override
    public String toString() {
        ListElement<T> temp = start;
        String output = "";
        for (int i = 0; i < size; i++) {
            temp = temp.getNext();
            output += temp.getValue().toString() + " ";
        }
        return output;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == this.getClass()) {
            MyList<T> temp = (MyList<T>)obj;
            if(temp.getSize() == this.size)
                return true;
            else return false;
        }else return false;
    }

    public void insertEnd(T value) {
        ListElement<T> element = new ListElement<>(value);//element to insert
        ListElement<T> mem = new ListElement<>(null);//memory
        end.getPrev().setNext(mem);
        mem.setPrev(end.getPrev());// remember previous element
        /*new element next => end
        * end prev => new element */
        element.setNext(end);
        end.setPrev(element);
        /*previous element next => new element
        * new element prev => previous element */
        mem.getPrev().setNext(element);
        element.setPrev(mem.getPrev());
        size++;
    }
    public void insertStart(T value) {
        ListElement<T> element = new ListElement<>(value);//element to insert
        ListElement<T> mem = new ListElement<>(null);//memory
        start.getNext().setPrev(mem);
        mem.setNext(start.getNext());
        /*new element prev => start
         * start next => new element */
        element.setPrev(start);
        start.setNext(element);
        /*previous first element prev => new element
         * new element next => previous first element */
        mem.getNext().setPrev(element);
        element.setNext(mem.getNext());
        size++;
    }
    public T getLast() {
        return end.getPrev().getValue();
    }
    public T getFirst() {
        return start.getNext().getValue();
    }
    public int getSize() {
        return size;
    }
    public void clear() {
        start.setNext(end);
        end.setPrev(start);
    }
    public T get(int elementIndex) {
        if (elementIndex > size) {throw new IndexOutOfBoundsException("Index: " + elementIndex + " is not in list.size: " + size);}
        ListElement<T> temp;
        if (elementIndex <= size / 2) {
            temp = start;
            for (int j = 0; j <= size; j++) {
                temp = temp.getNext();
                if(j == elementIndex) {
                    return temp.getValue();
                }
            }
        }
        else {
            temp = end;
            for (int j = size - 1; j >= 0; j--) {
                temp = temp.getPrev();
                if(j == elementIndex) {
                    return temp.getValue();
                }
            }
        }
        throw new IndexOutOfBoundsException("Index: " + elementIndex + " is not in list.size: " + size);
    }

    private class ListElement<T> {
        private T value;
        private ListElement<T> next;
        private ListElement<T> prev;

        protected ListElement(T value) {
            this.value = value;
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

}
