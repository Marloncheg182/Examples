package Interview.BinaryTree;

import java.util.Stack;

/**
 * Created by Oleg Romanenchuk on 8/23/2015.
 */
public class PostOrder {
    public static class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data)
        {
            this.data=data;
        }
    }
    public void postOrder(TreeNode root){
        if (root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.printf("%d ", root.data);
        }
    }

    public void postorderIter(TreeNode root){
        if (root == null)
            return;
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode current = root;
        while (true){
            if (current !=null){
                if (current.right !=null)
                    s.push(current.right);
                s.push(current);
                current = current.left;
                continue;
            }
            if (s.isEmpty())
                return;
            current = s.pop();
            if (current.right !=null && ! s.isEmpty() && current.right == s.peek()){
                s.pop();
                s.push(current);
                current = current.right;
            }else {
                System.out.println(current.data + " ");
                current = null;
            }
        }
    }

    public static void main(String[] args) {
        PostOrder po = new PostOrder();
        TreeNode rootNode = createBinaryTree();
        System.out.println("Using Recursive solution:");

        po.inOrder(rootNode);
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Using Iterative solution:");

        po.inOrderIter(rootNode);
    }

    private void inOrderIter(TreeNode root) {
        if (root == null)
            return;
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode currentNode = root;
        while (!s.empty() || currentNode!=null){
            if (currentNode!=null)
            {
                s.push(currentNode);
                currentNode=currentNode.left;
            }else {
                TreeNode n = s.pop();
                System.out.printf("%d ", n.data);
                currentNode = n.right;
            }
        }
    }

    private void inOrder(TreeNode root) {
        if (root!=null){
            inOrder(root.left);
            System.out.printf("%d ", root.data);
            inOrder(root.right);
        }
    }

    private static TreeNode createBinaryTree() {
        TreeNode rootNode =new TreeNode(40);
        TreeNode node20=new TreeNode(20);
        TreeNode node10=new TreeNode(10);
        TreeNode node30=new TreeNode(30);
        TreeNode node60=new TreeNode(60);
        TreeNode node50=new TreeNode(50);
        TreeNode node70=new TreeNode(70);

        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;

        return rootNode;
    }
}
