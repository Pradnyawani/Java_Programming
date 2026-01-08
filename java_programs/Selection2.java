import java.util.Scanner;

class Selection2
{
    public static void main(String A[])
    {
       Scanner sobj = new Scanner(System.in);
        int iStd=0;

       System.out.println("Enter your Standard:");
        iStd=sobj.nextInt();
        

            if(iStd ==1)
            {
                System.out.println("exam at 9AM");
            }
            else if(iStd == 2)
            {
                System.out.println("exam at 10AM");
            }
              if(iStd == 3)
            {
                System.out.println("exam at 11AM");
            }
            else if(iStd == 4)
            {
                System.out.println("exam at 12noon");
            }
            else{
                System.out.println("invalid standard");
            }

    }
}