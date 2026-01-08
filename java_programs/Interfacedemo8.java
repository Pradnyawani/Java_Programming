interface A
{
    int No=11;
    void fun();
    default void gun() //java version 8 
    {
        System.out.println("inside gun");
    }
}




class Demo implements A  
{
  public void fun()
  {
      System.out.println("inside fun");   
  }

 
}



class Interfacedemo8
{
    public static void main(String A[])
    {
       Demo dobj =new Demo();
       dobj.fun();
       dobj.gun();
       
    }
}