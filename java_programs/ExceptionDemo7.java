
import  java.util.*;  
class ExceptionDemo7
{

    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int iNo1=1,iNo2=0,iAns=0;

        System.out.println("enter first number:");
        iNo1=sobj.nextInt();

        System.out.println("enter second number:");
        iNo2=sobj.nextInt();

        try
        {
            System.out.println("inside try block");
             iAns=iNo1 /iNo2;
        }

        System.out.println("hello");   //error

        catch(ArithmeticException aobj)          //specific catch
        {
            System.out.println("inside catch block");
            System.out.println(aobj);
        }

        catch(Exception eobj)                  //Genric catch
        {
            System.out.println("inside Genric catch");
        }

        finally
        {
            System.out.println("inside finally block");
        }
        
       

        System.out.println("Divison is:"+iAns);


    }
}