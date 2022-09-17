import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void canCreateWithMultipleValues() {
        var linkedList = new LinkedList(8, 4);
        assertNotNull(linkedList);
    }

    @Test
    void canCreateWithTwoValuesAndGetNext() {
        var linkedList = new LinkedList(8, 4);
        assertNotNull(linkedList.head().next().value);
        assertNotEquals(linkedList.head().value, linkedList.head().next().value);
    }

    @Test
    void canCreateWithThreeValuesAndGetNextTwice() {
        var linkedList = new LinkedList(8, 4, 2);
        assertNotNull(linkedList.head().next().next().value);
    }

    @Test
    void canAddNodeToExistingListOfOne() {
        var linkedList = new LinkedList(8);
        linkedList.add(2);
        assertNotNull(linkedList.head().next().value);
        assertEquals(2, linkedList.head().next().value);
    }

    @Test
    void canAddNodeToExistingListOfTwo() {
        var linkedList = new LinkedList(8, 4);
        linkedList.add(2);
        assertNotNull(linkedList.head().next().next().value);
        assertEquals(2, linkedList.head().next().next().value);
    }

    @Test
    void canAddManyToExistingList() {
        var linkedList = new LinkedList(8, 4);
        linkedList.add(2, 5, 7);
        assertNotNull(linkedList.head().next().next().value);
        assertEquals(2, linkedList.head().next().next().value);
        assertEquals(5, linkedList.head().next().next().next().value);
    }

    @Test
    void canAddNodeToEmptyList() {
        var linkedList = new LinkedList();
        linkedList.add(2);
        assertNotNull(linkedList.head().value);
        assertEquals(2, linkedList.head().value);
    }

    @Test
    void canAddManyNodesToEmptyList() {
        var linkedList = new LinkedList();
        linkedList.add(2, 6, 7);
        assertNotNull(linkedList.head().value);
        assertEquals(2, linkedList.head().value);
        assertEquals(6, linkedList.head().next().value);
    }

    @Test
    void canGetTailWhichHasNullNext() {
        var linkedList = new LinkedList(3,4,7);
        assertEquals(7, linkedList.tail().value);
        assertNull(linkedList.tail().next().value);
    }

    @Test
    void canFindNodeByValue() {
        var linkedList = new LinkedList(3,4,7);
        var result = linkedList.find(4);
        assertEquals(4, result.value);
    }
}
