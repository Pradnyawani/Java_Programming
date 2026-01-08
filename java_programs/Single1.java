class Base{   //8
    public int i,j;


    public void fun()
    {
        System.out.println("inside base fun");
    }
}

class Derived extends Base{    //12
    public int x;
    
    public void gun()
    {
    System.out.println("inside derivd gun");

    }
}

class Single1
{
   public static void main(String A[])
   {
       Base bobj = new Base();
       Derived dobj = new Derived();

       bobj.fun();
       dobj.fun();
       dobj.gun();

   }
}