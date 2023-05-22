package HelloUniverse.Tree;

public class MyTree {
    private MyNode root;
    private MyNode node;
    
    MyTree() {}

    public MyTree(int data) {
        this.root = new MyNode(data);
    }

    public MyNode setRoot(int data) {
        this.root = new MyNode(data);
        return this.root;
    }

    public MyNode getRoot() {
        return this.root;
    }

    /*
     * 검색된 노드를 클래스 변수에 담는 것으로 처리하는 로직
     */
    public MyNode findNode(int data) {
        this._findNode(data, this.root);
        return this.node;
    }

    private void _findNode(int data, MyNode target) {
        if (data == target.getData()) {
            this.node = target;
        } else {
            if (target.getLeftChildNode() != null) this._findNode(data, target.getLeftChildNode());
            if (target.getRightChildNode() != null) this._findNode(data, target.getRightChildNode());
        }
    }
    
    /*
     * 검색된 노드를 반환하는 것으로 처리
     */
    public MyNode findMyNode(int data) {
        return _findMyNode(data, this.root);
    }

    private MyNode _findMyNode(int data, MyNode node) {
        if (data == node.getData()) {
            return node;
        } else {
            if (node.getLeftChildNode() != null) {
                MyNode tmpNode = this._findMyNode(data, node.getLeftChildNode());
                if (tmpNode != null) return tmpNode;
            } 
            
            if (node.getRightChildNode() != null) {
                MyNode tmpNode = this._findMyNode(data, node.getRightChildNode());
                if (tmpNode != null) return tmpNode;
            }
            
            return null;
        }
    }
}
