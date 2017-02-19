package edu.ashish.AITRial;


/**
 * Created by admin on 21-Jul-16.
 */


/*
        TYPICAL USAGE:-
        Tree tree = new Tree("A");

        tree.addLeftNode(tree.getRoot()  , "B");
        tree.addRightNode(tree.getRoot()  , "C");

        tree.addLeftNode(tree.getNodeWithValue("B"), "D");
        tree.addRightNode(tree.getNodeWithValue("B"), "E");

        tree.addLeftNode(tree.getNodeWithValue("C"), "F");
        tree.addRightNode(tree.getNodeWithValue("C"), "G");

        tree.addLeftNode(tree.getNodeWithValue("D"), "H");
        tree.addRightNode(tree.getNodeWithValue("D"), "I");

        tree.addRightNode(tree.getNodeWithValue("G"), "N");
        System.out.println(tree.getNodeWithValue("N").getValue());
*/

public class Tree {

    Node root;

    /**
     * @param rootValue is the value of the root of the new tree that user wants to make.
     */
    public Tree(String rootValue) {
        root = new Node(rootValue);
    }

    public Node addLeftNode(Node sourceNode, String value) {
        sourceNode.leftNode = new Node(value);

        return sourceNode.leftNode;
    }

    public Node addRightNode(Node sourceNode, String value) {
        sourceNode.rightNode = new Node(value);

        return sourceNode.rightNode;
    }

    public Node getRoot() {
        return this.root;
    }


    public Node getNodeWithValue(String value) {
        Node node = searchNode(this.getRoot(), value);

        return node;
    }


    private Node searchNode(Node node, String value) {

        if (node.getValue().equals(value)) return node;

        if (node.leftNode != null) {
            Node node1 = searchNode(node.leftNode, value);
            if (node1 != null) return node1;
        }

        if (node.rightNode != null) {
            Node node1 = searchNode(node.rightNode, value);
            if (node1 != null) return node1;
        }

        return null;

    }


}


class Node {

    Node leftNode;
    Node rightNode;
    String value;

    private Node() {
        super();
    }

    public Node(String value) {
        Node node = this;
        node.value = value;
        node.leftNode = null;
        node.rightNode = null;
    }

    public String getValue() {
        return value;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }


}