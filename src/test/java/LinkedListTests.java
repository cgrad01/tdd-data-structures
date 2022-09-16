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

    @Test
    void headHasValueWhenProvided() {
        var linkedList = new LinkedList(8);
        assertNotNull(linkedList.head().value);
    }

    @Test
    void headHasNullNextWhenOnlyOneMember() {
        var linkedList = new LinkedList(8);
        assertNull(linkedList.head().next().value);
    }
}
