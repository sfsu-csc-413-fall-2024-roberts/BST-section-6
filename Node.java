public class Node {
    private int value;

    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public int getValue() {
        return value;
    }

    public void insert(int value) {
        if (value < this.value) {
            if (this.left == null) {
                this.left = new Node(value);
            } else {
                this.left.insert(value);
            }
        } else {
            if (this.right == null) {
                this.right = new Node(value);
            } else {
                this.right.insert(value);
            }
        }
    }

    public boolean search(int value) {
        if (this.value == value) {
            return true;
        } else if (value < this.value) {
            if (this.left == null) {
                return false;
            } else {
                return this.left.search(value);
            }
        } else {
            if (this.right == null) {
                return false;
            } else {
                return this.right.search(value);
            }
        }
    }

    public void printInOrder() {
        if (this.left != null) {
            this.left.printInOrder();
        }

        System.out.print(String.format("%d ", this.value));

        if (this.right != null) {
            this.right.printInOrder();
        }
    }

}