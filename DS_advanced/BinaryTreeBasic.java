import java.util.Scanner;

// Queue Node
class QueueNode {
    TreeNode data;
    QueueNode next;

    QueueNode(TreeNode data) {
        this.data = data;
        next = null;
    }
}

// Queue
class Queue {
    QueueNode head;
    int size;
    int max;

    Queue(int size) {
        this.max = size;
    }

    void enqueue(TreeNode ele) {
        QueueNode newNode = new QueueNode(ele);
        if (head == null) {
            size++;
            head = newNode;
            return;
        } else {
            if (size < max) {
                QueueNode temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                size++;
                temp.next = newNode;
            } else {
                System.out.println("Queue Full, can't insert");
                System.out.println();
            }
        }
    }

    TreeNode dequeue() {
        if (head == null) {
            return null;
        } else {
            size--;
            TreeNode tempData = head.data;
            head = head.next;
            return tempData;
        }
    }

    boolean isEmpty() {
        return head == null;
    }
}

// Binary Tree Node
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

// Binary Tree
class BinaryTree {
    int count=0;
    TreeNode root;
    void insert() {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        TreeNode newNode = new TreeNode(first);
        Queue q = new Queue(100);
        if (root == null) {
            root = newNode;
        }
        q.enqueue(root);
        while (!q.isEmpty()) {
            TreeNode current = q.dequeue();
            int tempLeft = sc.nextInt();
            if (tempLeft != -1) {
                TreeNode leftNode = new TreeNode(tempLeft);
                current.left = leftNode;
                q.enqueue(leftNode);
            }
            int tempRight = sc.nextInt();
            if (tempRight != -1) {
                TreeNode rightNode = new TreeNode(tempRight);
                current.right = rightNode;
                q.enqueue(rightNode);
            }
        }
    }
//search

Boolean searching(TreeNode current,int ele){
    if(current==null){
        return false;
    }
    if(ele==current.data){
        return true;
    }
    return ele<current.data? searching(current.left,ele):searching(current.right,ele);
}



// Height of tree
    int height(TreeNode current){
        if(current==null){
            return 0;
        }
        return 1+Math.max(height(current.left),height(current.right));
    }
// diameter
    int dia(TreeNode current){
        if(current==null){
            return 0;
        }
        return Math.max((1+(height(current.left)+height(current.right))),(Math.max(dia(current.left),dia(current.right))));
    }

//Adding elements of  tree

int add(TreeNode current){
    if(current==null){
        return 0;
    }
    return current.data+add(current.left)+add(current.right);
}


//In-Oder
    void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }
    

//Pre-Order
void preorderTraversal(TreeNode node) {
    if (node == null) {
        return;
    }
    System.out.print(node.data + " ");
    preorderTraversal(node.left);
    preorderTraversal(node.right);
}







//Calling method from methods
//preorderTraversal
void preorder() {
    preorderTraversal(root);
}
//In-order
void inorder() {
    inorderTraversal(root);
}
//Height
int heighting() {
    return height(root);
}
// diameter
int diameter() {
    return dia(root);
}
// searching
boolean search(int ele){
    return searching(root,ele);
}
//sum
int sum(){
    return add(root);
}


}


public class BinaryTreeBasic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();
        System.out.println("Welcome to SHARMA'S Tree!");
        System.out.println("Select Operation to perform in binary tree");
        while(true){
            System.out.println();
            System.out.println("1:Inserting elements");
            System.out.println("2:Inorder");
            System.out.println("3:PreOrder");
            System.out.println("4:Searching Element");
            System.out.println("5:Height of Tree ");
            System.out.println("6:Diameter of Tree");
            System.out.println("7:Sum of Elements in tree");
            System.out.println("8:Exit");
            System.out.println();
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    binaryTree.insert();
                    break;
                case 2:
                    binaryTree.inorder();
                    break;
                case 3:
                    binaryTree.preorder();
                    break;
                case 4:
                    System.out.println("Enter element to search:");
                    System.out.println();
                    int ele=sc.nextInt();
                    System.out.println("Element available:"+binaryTree.search(ele));
                    break;
                case 5:
                    System.out.println("Height"+binaryTree.heighting());
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Height"+binaryTree.diameter());
                    System.out.println();
                    break;
                case 7: 
                    System.out.println("Sum:"+binaryTree.sum());
                    System.out.println();
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        }
        
        
    }
}
