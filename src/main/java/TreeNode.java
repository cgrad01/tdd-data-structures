import java.util.Arrays;

public class TreeNode {
    public Integer value;
    private TreeNode[] children;

    public TreeNode(Integer value) {
        this.value = value;
        this.children = new TreeNode[0];
    }

    public void addChildren(TreeNode... newChildren) {
        var childrenCopy = Arrays.copyOf(this.children, this.children.length + newChildren.length);
        System.arraycopy(newChildren, 0, childrenCopy, this.children.length, newChildren.length);
        this.children = childrenCopy;
    }

    public TreeNode[] getChildren() {
        return this.children;
    }

    public TreeNode getLeft() {
        return this.children.length > 0 ? this.children[0] : null;
    }

    public TreeNode getRight() {
        return this.children.length > 0 ? this.children[this.children.length - 1] : null;
    }
}
