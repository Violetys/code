package something1;

class TreeNode{

	public TreeNode left;
	public TreeNode right;
	
}

public class IsAVLTree {
  private boolean isBalanced = false;//最后的返回值

  public boolean IsBalanced_Solution(TreeNode root) {
      getDepth(root);
      return isBalanced;
  }
  public int getDepth(TreeNode root) {
      if(root == null) {
          isBalanced = true;
          return 0;
      }
      int left = getDepth(root.left);//左子树
      int right = getDepth(root.right);//右子树
      int depth = (left > right ? left : right) + 1;
      if(Math.abs(left - right) <= 1) {
          isBalanced = true;
      } else {
          isBalanced = false;
      }
      return depth;//下层的深度，上层可以接着用免得再遍历
  }
}
