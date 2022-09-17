public class TreeNode {
    public Integer value;
    private TreeNode[] children;

    public TreeNode(Integer value) {
        this.value = value;
        this.children = new TreeNode[0];
    }

    public void addChild(TreeNode treeNode) {
        this.children = new TreeNode[]{treeNode};
    }

    public TreeNode[] getChildren() {
        return this.children;
    }
}
