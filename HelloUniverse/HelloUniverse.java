package HelloUniverse;

import HelloUniverse.Tree.MyNode;
import HelloUniverse.Tree.MyTree;

public class HelloUniverse {
    public static void main(String[] args) {
        MyTree tree = new MyTree();

        // 루트 생성
        tree.root = new MyNode(5);
            tree.addLeft(new MyNode(3), tree.root);
                tree.addLeft(new MyNode(1), tree.root.lc);
                tree.addRight(new MyNode(4), tree.root.lc);
            tree.addRight(new MyNode(8), tree.root);
                tree.addLeft(new MyNode(7), tree.root.rc);
                tree.addRight(new MyNode(8), tree.root.rc);

        System.out.println(tree.findNode(7).data);
    }
}