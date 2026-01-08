class Base
{
 public void fun()  //defination
 {}   
  public void gun() //defination
  {} 
}
class Derived extends Base
{
  public void run() //defination
  {}
  public void gun() //overriding
  {}
}


class Finalmethod1
{
 public static void main(String A[])
 {
   Demo dobj=new Demo();
   System.out.println(dobj.i);
    System.out.println(dobj.j);

    dobj.i++;
   // dobj.j++;
 }
}