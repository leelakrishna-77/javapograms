public class Nonstaticfunctionadd
{
        public void add()
        {
         int a=2;
         int b=2;
         int c=a+b;
         System.out.println(c);
        }
        public static void main(String[] args)
        {
            Main m=new Main();
            m.add();
        }
}