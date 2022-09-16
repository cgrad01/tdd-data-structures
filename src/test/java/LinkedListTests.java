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
        assertNull(linkedList.head().next());
    }

    @Test
    void canCreateWithMultipleValues() {
        var linkedList = new LinkedList(8, 4);
        assertNotNull(linkedList);
    }

    @Test
    void canCreateWithTwoValuesAndGetNext() {
        var linkedList = new LinkedList(8, 4);
        assertNotNull(linkedList.head().next().value);
    }
}
