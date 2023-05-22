package HelloUniverse;

import HelloUniverse.Tree.MyTree;

public class HelloUniverse {
    public static void main(String[] args) {
        MyTree tree = new MyTree(1);

        tree.getRoot().addChildNode(2).addChildNode(3);
        tree.getRoot().getLeftChildNode().addChildNode(4).addChildNode(5);
        tree.getRoot().getRightChildNode().addChildNode(6).addChildNode(7);

        System.out.println(tree.findMyNode(0));
    }
}