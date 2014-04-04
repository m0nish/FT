package Trees;

/**
 * Created by Monish on 4/3/14.
 */
public class InOrderTraversalWithParent {

    TreeNodeP left;
    TreeNodeP right;
    TreeNodeP parent;
    int value;

    public TreeNodeP(){
        left=right=parent=null;
    }

    public void inOrderTraversal(TreeNodeP root){
        if(root==null){
            return;
        }
        TreeNodeP prev=null,curr=root,next=null;
        while(curr!=null){
            if(prev==null|| prev.left==curr||prev.right==curr){
               if(curr.left!=null){
                   next = curr.left;
               }else{
                   System.out.println(curr.value);
                   if(curr.right!=null)
                       next= curr.right;
                   else
                       next=curr.parent;
               }
            }else if(curr.left==prev){
                System.out.println(curr.value);
                if(curr.right!=null)
                    next= curr.right;
                else
                    next=curr.parent;
            }else{
                 next = curr.parent;
            }
            prev=curr;
            curr=next;
        }

    }
}
