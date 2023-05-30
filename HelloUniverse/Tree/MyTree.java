package HelloUniverse.Tree;

public class MyTree {
    private MyNode root;
    private MyNode searchNode;
    
    public MyTree(MyNode node) {
        this.root = node;
    }

    public MyTree(int data) {
        this(new MyNode(data));
    }

    public MyNode getRoot() {
        return this.root;
    }

    /*
     * 검색된 노드를 클래스 변수에 담는 것으로 처리하는 로직
     */
    public MyNode findNode(int data) {
        this._findNode(data, this.root);
        return this.searchNode;
    }

    // 노드의 데이터를 비교하는 재귀메서드
    private void _findNode(int data, MyNode target) {
        if (data == target.getData()) {
            this.searchNode = target;
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

    // 노드의 데이터를 비교하는 재귀메서드
    private MyNode _findMyNode(int data, MyNode node) {
        // 노드의 데이터와 찾는 데이터가 같으면 해당 노드를 반환
        if (data == node.getData()) {
            return node;
        } else { // 해당 노드의 데이터가 찾는 데이터가 아니라면
            // 좌측 하위 노드가 존재하면 재귀호출
            if (node.getLeftChildNode() != null) {
                MyNode tmpNode = this._findMyNode(data, node.getLeftChildNode());
                if (tmpNode != null) return tmpNode;
            }
            
            // 우측 하위 노드가 존재하면 좌측 하위 노드를 인수로 재귀호출
            if (node.getRightChildNode() != null) {
                MyNode tmpNode = this._findMyNode(data, node.getRightChildNode());
                if (tmpNode != null) return tmpNode;
            }
            
            // 하위 노드가 없거나 재귀호출이 모두 끝났는데 찾는 데이터가 없다면 null 반환
            return null;
        }
    }

    // 노드의 존재 여부를 확인하는 메서드
    public boolean includes(MyNode node) {
        return _includes(this.getRoot(), node);
    }

    private boolean _includes(MyNode myNode, MyNode node) {
        if (myNode == node) {
            return true;
        } else {
            if (myNode.getLeftChildNode() != null) {
                if (_includes(myNode.getLeftChildNode(), node)) {
                    return true;
                }
            }

            if (myNode.getRightChildNode() != null) {
                if (_includes(myNode.getRightChildNode(), node)) {
                    return true;
                }
            }

            return false;
        }
    }
}
