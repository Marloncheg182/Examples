package Interview.BinaryTree;

import java.util.Stack;

/**
 * Created by Oleg Romanenchuk on 8/23/2015.
 */
public class SpiralLevelOrder {
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

    public static void spiralOrZigzagLevelOrder(TreeNode root)
    {
        if (root ==null)
            return;
        Stack<TreeNode>stack = new Stack<TreeNode>();
        stack.push(root);

        boolean directionflag = false;
        while (!stack.isEmpty())
        {
            Stack<TreeNode>tempStack = new Stack<TreeNode>();
            while (!stack.isEmpty())
            {
                TreeNode tempNode = stack.pop();
                System.out.printf("%d ", tempNode.data);
                if (!directionflag){
                    if (tempNode.left!=null)
                        tempStack.push(tempNode.left);
                    if (tempNode.right!=null)
                        tempStack.push(tempNode.right);
                }else {
                    if (tempNode.right!=null)
                        tempStack.push(tempNode.right);
                    if (tempNode.left!=null)
                        tempStack.push(tempNode.left);
                }
            }
            directionflag=!directionflag;
            stack=tempStack;
        }
    }

    public static void main(String[] args) {
        SpiralLevelOrder slo = new SpiralLevelOrder();
        TreeNode rootNode = createBinaryTree();
        System.out.println("Spiral traversal of binary tree:");
        spiralOrZigzagLevelOrder(rootNode);
    }

    private static TreeNode createBinaryTree() {
        TreeNode rootNode =new TreeNode(40);
        TreeNode node20=new TreeNode(20);
        TreeNode node10=new TreeNode(10);
        TreeNode node30=new TreeNode(30);
        TreeNode node60=new TreeNode(60);
        TreeNode node50=new TreeNode(50);
        TreeNode node70=new TreeNode(70);
        TreeNode node5=new TreeNode(5);
        TreeNode node55=new TreeNode(55);

        rootNode.left = node20;
        rootNode.right = node60;

        node20.left = node10;
        node20.right = node70;

        node60.left = node50;
        node60.right = node70;
        node10.left = node5;
        node50.right = node55;

        return rootNode;
    }


}