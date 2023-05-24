package HelloUniverse.Tree;

public class MyNode {
    private MyNode p;
    private MyNode lc;
    private MyNode rc;

    private int data;

    public MyNode(int data) {
        this.data = data;
    }

    public MyNode addChildNode(MyNode node) {
        if (this.lc == null) {
            this.setLeftChildNode(node);
            this.lc.setParent(this);
        } else if (this.rc == null) {
            this.setRightChildNode(node);
            this.rc.setParent(this);
        }
        return this;
    }

    public MyNode addChildNode(int data) {
        return this.addChildNode(new MyNode(data));
    }

    public MyNode setParent(MyNode p) {
        this.p = p;
        return this;
    }

    public MyNode setLeftChildNode(MyNode lc) {
        this.lc = lc;
        return this;
    }

    public MyNode setRightChildNode(MyNode rc) {
        this.rc = rc;
        return this;
    }

    public int getData() {
        return this.data;
    }

    public MyNode getParaent() {
        return this.p;
    }

    public MyNode getLeftChildNode() {
        return this.lc;
    }

    public MyNode getRightChildNode() {
        return this.rc;
    }
}