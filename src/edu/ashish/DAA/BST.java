package edu.ashish.DAA;

/**
 * Created by admin on 30-Jul-16.
 */
public class BST {

    NodeForBST root;
    private NodeForBST currentNode = root;

    public BST(int root) {
        this.root = new NodeForBST(root);
    }

    public void add(int value) {

        if (value >= currentNode.getValue()) {

            if (currentNode.getRight() == null) {
                currentNode.setRight(new NodeForBST(value));
            } else
                currentNode = currentNode.getRight();
        } else {

            if (currentNode.getLeft() == null) {
                currentNode.setLeft(new NodeForBST(value));
            } else
                currentNode = currentNode.getLeft();


        }

        add(value);

    }

    public void printTree() {

    }


}


class NodeForBST extends Node {

    private int value;
    private NodeForBST left;
    private NodeForBST right;

    public NodeForBST(int value) {
        this.setValue(value);
    }

    public NodeForBST() {
        super();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public NodeForBST getLeft() {
        return left;
    }

    public void setLeft(NodeForBST left) {
        this.left = left;
    }

    public NodeForBST getRight() {
        return right;
    }

    public void setRight(NodeForBST right) {
        this.right = right;
    }
}
