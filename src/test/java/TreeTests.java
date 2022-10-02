import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// see https://www.cs.cmu.edu/~clo/www/CMU/DataStructures/Lessons/lesson4_1.htm
public class TreeTests {
    @Test
    void canCreateTreeWithRoot() {
        var tree = new Tree(new TreeNode(4));
        assertNotNull(tree);
    }

    @Test
    void rootCanHaveChild() {
        var tree = new Tree(new TreeNode(3));
        tree.getRoot().addChildren(new TreeNode(4));
        assertEquals(1, tree.getRoot().getChildren().length);
    }

    @Test
    void rootCanHaveChildren() {
        var tree = new Tree(new TreeNode(3));
        tree.getRoot().addChildren(new TreeNode(4));
        tree.getRoot().addChildren(new TreeNode(8));
        assertEquals(2, tree.getRoot().getChildren().length);
    }

    @Test
    void canGetLeftAndRightNodes() {
        var tree = new Tree(new TreeNode(3));
        tree.getRoot().addChildren(new TreeNode(4));
        tree.getRoot().addChildren(new TreeNode(5));
        tree.getRoot().addChildren(new TreeNode(8));
        assertEquals(4, tree.getRoot().getLeft().value);
        assertEquals(8, tree.getRoot().getRight().value);
    }

}
