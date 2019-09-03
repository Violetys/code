package something1;
/*
 * 
 * */
class Node{
	public Node() {
		
	}

	public Node getNext() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNext(Node preNode) {
		// TODO Auto-generated method stub
		
	}
}
public class FzNode{
	public static Node reverseListNode(Node head){
	  //单链表为空或只有一个节点，直接返回原单链表
	  if (head == null || head.getNext() == null){
	      return head;
	  }
	  //前一个节点指针
	  Node preNode = null;
	  //当前节点指针
	  Node curNode = head;
	  //下一个节点指针
	  Node nextNode = null;
	
	  while (curNode != null){
	      nextNode = curNode.getNext();//nextNode 指向下一个节点
	      curNode.setNext(preNode);//将当前节点next域指向前一个节点
	      preNode = curNode;//preNode 指针向后移动
	      curNode = nextNode;//curNode指针向后移动
	  }
	
	  return preNode;
	}
}