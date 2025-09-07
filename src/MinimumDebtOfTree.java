
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author guero
 */
public class MinimumDebtOfTree {  
    
    
   private static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
   
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3); 
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.err.println(minDepthHelper(root, 0)); 
//        TreeNode root = new TreeNode(2); 
//        root.right = new TreeNode(3);
//         root.right.right = new TreeNode(4);
//          root.right.right.right = new TreeNode(5);
//           root.right.right.right.right = new TreeNode(6);
//           System.err.println(minDepthHelper(root, 0)); 
   System.err.println(minDepthHelper(null, 0)); 

//TreeNode root = new TreeNode(1); 
//root.left = new TreeNode(2);
//root.right = new TreeNode(3);
//root.left.left = new TreeNode(4);
//root.left.right= new TreeNode(5);
//System.err.println(minDepthHelper(root, 0));
        
//           int static tot = 0; 
        // TODO code application logic here
    }
     public static int minDepthHelper( TreeNode root, int level){
         Queue <TreeNode> q  = new LinkedList(); 
         q.add(root); 
         int tot  = 1; 
         while(!q.isEmpty()){
             int Qsize  = q.size(); 
             
             for (int i = 0; i < Qsize ; i++  ){
                 TreeNode temp = q.poll(); 
                // int cal  = temp.val; 
                 if (temp.left == null && temp.right ==null){
                    return tot; 
                 }
                 if (temp.left != null)
                q.add(temp.left); 
                   if (temp.right != null)
                q.add(temp.right); 
             }
             tot++; 
             
             
         
         }
        
         return tot; 
     
     }
      public static int minDepthHelper3( TreeNode root, int level){
          Stack <TreeNode> s = new Stack(); 
          int size  = 0; 
          int index = 0; 
          int left  = 1; 
          int right = 0; 
          s.push(root); 
          while (!s.isEmpty() && root!= null){
//              TreeNode curr = root; 
             int r = root.val; 
              while ( root.left != null){
                  left++; 
                  
                  s.push(root.left); 
                  root  = root.left; 
              }
              int val = s.peek().val; 
              if (s.peek().left ==null && s.peek().right == null){
                  if (size < s.size()){
                  size = s.size(); 
                  size = left+right; 
                  }
//                  s.pop(); 
              
              }
              if(s.peek().right!= null){
              root  = s.pop().right; 
              right++;
              
              
              s.push(root); 
              }
              else {
                    root  = s.pop();
              }
              int afterRight= root.val; 
             
              System.err.println("");
              index++; 
              // s.pop(); 
          
          }
          if (size == 1){
          size  = index; 
          }
      return size ;
      }
    public static int minDepthHelper2( TreeNode root, int level){
        if (root == null){
        return 1; 
        }
        if (root.left == null && root.right == null){
        return level; 
        } 
        level = minDepthHelper(  root.left,  level+1); 
       
       level  = minDepthHelper(  root.right,  level+1); 
       return level; 
        
        
    }
     public static int minDepthHelper1( TreeNode root, int depth){
        Queue <TreeNode> q  = new LinkedList();
        q.add(root); 
        int count = 1; 
        int level = 0; 
        while (!q.isEmpty()){
          
            TreeNode temp = q.remove(); 
            System.err.println("Q: "+ temp.val);
            q.add(temp.left); 
            q.add(temp.right); 
            count++; 
            
            


        }
        return 0; 
     }


       
     
    
}
