package something1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
 * 层次遍历二叉树    （先序遍历）
 * 
 * */
public class CCBLTree {
    public static class TreeNode{
        int val;
        TreeNode left=null;
        TreeNode right=null;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<Integer>();  //存放结果
        Queue<TreeNode> queue= new LinkedList<TreeNode>();   //辅助队列
        if (root!=null){
            //根节点入队
            queue.offer(root);
        }
        //队列不为空，执行循环
        while (!queue.isEmpty()){
            TreeNode node=queue.poll();
            list.add(node.val);     //将队列元素输出
            int size=queue.size();
            //for(int i = 0;i < size;i++) {
            		
	            //如果有左节点，就把左节点加入
	            if (node.left!=null){
	                queue.offer(node.left);
	            }
	            //如果有右节点，就把右节点加入
	            if(node.right!=null){
	                queue.offer(node.right);
	            }
            //}
        }
        return list;
    }
}
