    import static org.junit.
        jupiter.api.Assertions.*;

    import org.junit.jupiter.api.BeforeAll;
    import org.junit.jupiter.api.Test;

public class MyListTest {
    @BeforeAll
    static void initAll() {
       MyList<Integer> list = new MyList<>();
    }
}
