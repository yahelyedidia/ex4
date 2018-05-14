public class AvlNode {

    private AvlNode father;

    private AvlNode leftSon;

    private AvlNode rightSon;

    private int data;

    public AvlNode(AvlNode father, AvlNode leftSon, AvlNode rightSon, int data) {
        this.father = father;
        this.leftSon = leftSon;
        this.rightSon = rightSon;
        this.data = data;
    }

    public AvlNode getFather() {
        return father;
    }

    public void setFather(AvlNode father) {
        this.father = father;
    }

    public AvlNode getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(AvlNode leftSon) {
        this.leftSon = leftSon;
    }

    public AvlNode getRightSon() {
        return rightSon;
    }

    public void setRightSon(AvlNode rightSon) {
        this.rightSon = rightSon;
    }

    public int getData() {
        return data;
    }
}

