public class BST {

    private Node root;

    public BST() {
        this.root = null;
    }

    public void insert(int value) {
        if (this.root == null) {
            this.root = new Node(value);
        } else {
            this.root.insert(value);
        }
    }

    public boolean search(int value) {
        return this.root.search(value);
    }

    public void printInOrder() {
        this.root.printInOrder();
    }

    public static void main(String[] args) {
        BST bst = new BST();

        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);

        System.out.println("5: " + bst.search(5)); // true
        System.out.println("3:" + bst.search(3)); // true
        System.out.println("7:" + bst.search(7)); // true
        System.out.println("2:" + bst.search(2)); // true
        System.out.println("4:" + bst.search(4)); // true
        System.out.println("6:" + bst.search(6)); // true
        System.out.println("8:" + bst.search(8)); // true
        System.out.println("1:" + bst.search(1)); // false
        System.out.println("9:" + bst.search(9)); // false

        bst.printInOrder(); // 2 3 4 5 6 7 8
    }
}
