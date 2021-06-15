public class BinaryTree {
  private TreeNode root;

  public void insert(int data) {
    if(root == null)
    this.root = new TreeNode(data);
    else root.insert(data);

  }
  public TreeNode find(int data) {
    if(root != null)
    return root.find(data);

    return null;
  }
  public void delete(int data) {

  }
}