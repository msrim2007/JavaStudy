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
            this.lc = node;
            this.lc.p = this;
        } else if (this.rc == null) {
            this.rc = node;
            this.rc.p = this;
        }
        return this;
    }

    public MyNode addChildNode(int data) {
        return this.addChildNode(new MyNode(data));
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