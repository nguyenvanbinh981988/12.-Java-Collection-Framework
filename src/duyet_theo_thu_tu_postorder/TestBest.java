package duyet_theo_thu_tu_postorder;

public class TestBest {
    public static void main(String[] args) {
        //create a BST
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.postorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
