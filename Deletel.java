class Node
{
    int data;
    Node next;
    Node (int n)
    {
        this.data=n;
        this.next=null;
    }
}
class Linkedlist
{
    Node head=null;
    void add(int n)
    {
        Node newnode=new Node(n);
        if (head==null)
        {
        head=newnode;
        }
        else
        {
            Node curr=head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=newnode;
       }
    }
    void addf(int n)
    {
        Node newnode=new Node(n);
        newnode.next=head;
        this.head=newnode;
    }
    void deletel()
    {
     Node curr=head;
     while(curr.next.next!=null)
     {
         curr=curr.next;
     }
     curr.next=null;
    }
    void display()
    {
        Node curr=head;
        while(curr!=null)
      {
        System.out.println(curr.data);
        curr=curr.next;
      }
    }
  }
public class Deletel
{
	public static void main(String[] args) 
	{
	 Linkedlist l=new Linkedlist();
	  l.add(1);
	  l.add(2);
	  l.add(3);
	  l.addf(4);
	  l.addf(5);
	  l.deletel();
	  l.display();
	}
}

