public class TreeNode {
  private int data;
  private TreeNode leftChild;
  private TreeNode rightChild;

  public TreeNode (int data){
    this.data = data;
  }

  public int getData(){
    return data;
  }
  public void setLeftChild(TreeNode leftChild){
    this.leftChild = leftChild;
  }
  public void setRightChild(TreeNode rightChild){
    this.rightChild = rightChild;
  }
  public TreeNode getLeftChild() {
    return leftChild;
  }
  public TreeNode getRightChild() {
    return rightChild;
  }
}