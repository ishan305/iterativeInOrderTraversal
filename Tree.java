import java.util.Stack;

class Tree {


    class Node
    {
      String val;
      Node right;
      Node left;
      public Node(String val, Node right, Node left){
        this.right = right;
        this.left = left;
        this.val = val;
      }
    }

    Node root;
    
    public Tree(){
    }

    public void inOrderTraversal(){
      Node lroot = this.root; //local root
      Stack<Node> stack = new Stack<Node>();
      
      while(!stack.isEmpty()|| lroot!=null){
       while(lroot!=null)
       {
         stack.push(lroot);
         lroot = lroot.left;
       }

       lroot = stack.pop();
       System.out.println(lroot.val);
       lroot = lroot.right;
      }
    }

    public void createSampleTree(){
      Node n4 = new Node("4",null,null);
      Node n5 = new Node("5",null, null);
      Node n2 = new Node("2", n5, n4);
      Node n3 = new Node("3", null, null);
      Node n1 = new Node("1", n3, n2);
      this.root = n1;
    }

  }