public class recursion
{

public int func(int n)
{
    if(n==1)
    {
        return 1;
    }
    return n*func(n-1);
}
	public static void main(String[] args) {
	    Main m=new Main();
		System.out.println(m.func(5));
	}
}