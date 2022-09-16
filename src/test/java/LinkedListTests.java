import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

// see https://technologystrive.com/linked-list/
public class LinkedListTests {
    @Test
    void canCreateLinkedList() {
        var linkedList = new LinkedList();
        assertNotNull(linkedList);
    }
}
