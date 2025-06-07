

// Define the Node class to represent each node in the binary tree
class Node {
    int data;           // Stores the value of the node
    Node left;          // Reference to the left child
    Node right;         // Reference to the right child

    // Constructor to initialize a node with a given value
    Node(int data) {
        this.data = data;   // Set the node's data
        this.left = null;   // Initialize left child as null
        this.right = null;  // Initialize right child as null
    }
}

// Define the BinaryTree class to manage the tree
class BinaryTree {
    Node root;  // Reference to the root node of the tree

    // Constructor to initialize an empty tree
    BinaryTree() {
        root = null;  // Set root to null
    }

    // Method to insert a new node into the binary tree
    void insert(int data) {
        root = insertRec(root, data);  // Call recursive insert method
    }

    // Recursive helper method to insert a node
    Node insertRec(Node root, int data) {
        // If the tree is empty or we reach a leaf, create a new node
        if (root == null) {
            root = new Node(data);
            return root;
        }

        // Recursively insert into left or right subtree based on value
        if (data < root.data) {
            root.left = insertRec(root.left, data);  // Insert into left subtree
        } else if (data > root.data) {
            root.right = insertRec(root.right, data); // Insert into right subtree
        }

        return root;  // Return the unchanged root node
    }

    // Method to perform in-order traversal
//    void inOrder() {
//        inOrderRec(root);  // Call recursive in-order method
//        System.out.println();  // Print newline for readability
//    }
//
//    // Recursive helper method for in-order traversal
//    void inOrderRec(Node root) {
//        if (root != null) {
//            inOrderRec(root.left);        // Traverse left subtree
//            System.out.print(root.data + " "); // Visit node
//            inOrderRec(root.right);       // Traverse right subtree
//        }
//    }

    // Main method to test the binary tree
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();  // Create a new binary tree

        // Insert some values
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // Perform in-order traversal
        System.out.println("In-order traversal of the binary tree:");
//        tree.inOrder();
    }
}