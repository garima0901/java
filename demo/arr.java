class demo
{
    demo()
    {
         System.out.println(" hello from constructor"):
    }
 }
class arr
{
      public static void main(String args[])
        {
             demo[] d= new demo[7];
             for(int i=0; i<d.length;i++)
             d[i]=new demo();
       }
}