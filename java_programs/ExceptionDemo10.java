
import  java.util.*;  
class ExceptionDemo10
{

    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int Arr[]={10,20,30,40,50};
        int iIndex =0,iData=0;
        System.out.println("enter the index number:");
        iIndex=sobj.nextInt();

        try
        {
            System.out.println("inside try");
            iData=Arr[iIndex];
        }
        catch(Exception eobj)
        {
            System.out.println("inside catch");
            System.out.println(eobj);

        }
        finally
        {
            System.out.println("inside finally");
        }
       

      System.out.println("element at that index is:"+iData);
        
       

        


    }
}