import java.util.Scanner;



class Dynamic1
{

    public static void main(String A[])
    {
        Scanner obj=new Scanner(System.in);
        int length=0;
           int Arr[];


        System.out.println("enter the name of elements:");
        length = obj.nextInt();

        Arr=new int[length];

        if(Arr==null)
        {
            System.out.println("unable to allocated\n");
        }
        else{
   System.out.println("memory gets succesfully allocated\n");
        }

        Arr=null;
        System.gc();

    }
}