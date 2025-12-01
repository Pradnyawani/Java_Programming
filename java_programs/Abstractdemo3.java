
abstract class Base
{
  public int i,j;
   
    public int Addition(int a,int b)
    {
        return a+b;
    }
     abstract public int Substraction(int a,int b);
    
}

class Derived extends Base //error
{
  public int Substraction(int a,int b);
  {
    return a-b;
  }
  public int Multiplication(int a,int b);
  {
    return a*b;
  }
}

class Abstractdemo3
{

    public static void main(String A[])
    {
          
          Base bp = new Derived();    
          int iRet=0;

          iRet=bp.Addition(11,10);
          system.out.println(iRet);
           iRet=bp.Substraction(11,10);
            system.out.println(iRet);
          //  iRet=bp.Multiplication(11,10); error





         
         
    }
}