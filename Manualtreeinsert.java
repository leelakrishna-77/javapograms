class node {
    int data;
    node left;
    node right;
    node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class tree{
    node root;
    tree(){
        this.root=null;
    }
    void inset(int n)
    {
        node newnode=new node(n);
        if(this.root==null) this.root=newnode;
        else{
            node curr=this.root;
            while(true)
            {
                if(n>curr.data)
                {
                    if(curr.right==null)
                    {
                        curr.right=newnode;
                        break;
                    }
                    else{
                        curr=curr.right;
                    }
                }
                else{
                    if(curr.left==null){
                        break;
                    }
                    else{
                        curr=curr.left;
                    }
                }
                
            }
        }
        
    }
    void inorder(node root){
        if(root!=null)
        {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
}
public class Manualtreeinsert
{
	public static void main(String[] args) {
		tree t=new tree();
		t.inset(3);
		t.inset(5);
		t.inset(1);
		t.inorder(t.root);
	}
}