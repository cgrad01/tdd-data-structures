import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

// see https://technologystrive.com/linked-list/
public class LinkedListTests {
    @Test
    void canCreateLinkedList() {
        var linkedList = new LinkedList();
        assertNotNull(linkedList);
    }

    @Test
    void headIsNullInEmptyLinkedLIst() {
        var linkedList = new LinkedList();
        assertNull(linkedList.head().value);
    }
}
