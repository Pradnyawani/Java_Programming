interface A
{
    int No=11;
    void fun();
}


interface B
{
    int No=21;
    void fun();
}


class Demo implements A,B  //Multiple inheritance(reusability)
{
  public void fun()
  {
      System.out.println("inside fun"+A.No);   //no generates error
  }

 
}



class Interfacedemo7
{
    public static void main(String A[])
    {
       Demo dobj =new Demo();
       dobj.fun();
       
    }
}