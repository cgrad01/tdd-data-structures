import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// see https://www.cs.cmu.edu/~clo/www/CMU/DataStructures/Lessons/lesson4_1.htm
public class TreeTests {
    @Test
    void canCreateTree() {
        var tree = new Tree();
        assertNotNull(tree);
    }
}
