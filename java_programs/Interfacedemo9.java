interface A
{
    int No=11;
    void fun();  //abstract method
    
    
     private void Display()   
    {
        System.out.println("inside private Display");

    }
     default void gun()
    {
        System.out.println("inside gun");
        Display();
    }
   
}




class Demo implements A  
{
  public void fun()
  {
      System.out.println("inside fun");   
  }

 
}



class Interfacedemo9
{
    public static void main(String A[])
    {
       Demo dobj =new Demo();
       dobj.fun();
       dobj.gun();
      // dobj.Display();  error
    }
}