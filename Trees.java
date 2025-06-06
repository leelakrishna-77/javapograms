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
public class Trees
{
	public static void main(String[] args) {
		node a=new node(1);
		node b=new node(3);
		node c=new node(5);
		a.left=b;
		a.right=c;
		System.out.println(a.data);
		System.out.println(a.left.data);
		System.out.println(a.right.data);
	}
}