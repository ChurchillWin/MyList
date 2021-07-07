    import static org.junit.
        jupiter.api.Assertions.*;

    import org.junit.jupiter.api.BeforeAll;
    import org.junit.jupiter.api.Test;

public class MyListTest {
    static MyList<Integer> list;
    private Object IndexOutOfBoundsException;

    @BeforeAll
    static void initAll() {
        list = new MyList<>();

        list.insertEnd(10);//3
        list.insertEnd(12);//4
        list.insertEnd(32);//5
        list.insertStart(15);//2
        list.insertStart(555);//1
        list.insertStart(666);//0
        list.insertEnd(5);//6
    }

    @Test
    void returnFirstElementValue() {
        assertEquals(666, list.getFirst());
    }

    @Test
    void returnLastElementValue() {
        assertEquals(5, list.getLast());
    }

    @Test
    void returns2ndElementValue() {
        assertEquals(555, list.get(1));
    }
    @Test
    void return6thElementValue() {
        //with backwards iteration
        assertEquals(32, list.get(5));
    }


}
