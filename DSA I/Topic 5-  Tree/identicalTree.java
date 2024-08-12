public class identicalTree {
    static boolean isidentical(Node n1, Node n2){
        if(n1==null && n2==null){
             return true;
        }

        if(n1.data != n2.data){
            return false;
        }
        if(n1==null || n2==null){
            return true;
        }
        return isidentical(n1.left, n2.left) && isidentical(n1.right, n2.right);
    }


    public static void main(String[] args) {
        Node root = new Node(26);
        root.left = new Node(16);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(2);
//        root.right.right = new node(3);
//        root.left.right.left = new node(3);
//        root.left.right.right= new node(3);

        Node rot = new Node(26);
        rot.left = new Node(16);
        rot.right = new Node(6);
        rot.left.left = new Node(2);
        rot.left.right = new Node(2);

        System.out.println(isidentical(root, rot));


    }
}