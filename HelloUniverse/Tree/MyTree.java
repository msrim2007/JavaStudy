package HelloUniverse.Tree;

public class MyTree {
    public MyNode root;
    private MyNode node;

    // 노드를 추가한다, (좌측 하위 노드)
    public void addLeft(MyNode n, MyNode p) {
        p.lc = n; // 상위노드의 좌측하위노드를 지정
        n.p = p; // 추가하는 노드의 상위노드를 지정
    }

    // 노드를 추가한다. (우측 하위 노드)
    public void addRight(MyNode n, MyNode p) {
        p.rc = n;
        n.p = p;
    }

    // 노드를 찾는다.
    public MyNode findNode(int data) {
        this._findNode(data, this.root);
        return this.node;
    }

    private void _findNode(int data, MyNode target) {
        if (data == target.data) {
            this.node = target;
        } else {
            if (target.lc != null) this._findNode(data, target.lc);
            if (target.rc != null) this._findNode(data, target.rc);
        }
    }
}
