import java.util.Stack;

class Main{
  
  public static void main(String[] args) {
      System.out.println("Printing the tree");
      Tree exTree = new Tree();
      exTree.createSampleTree();
      exTree.inOrderTraversal();
    }
}