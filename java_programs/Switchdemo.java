import java.util.Scanner;

class Switchdemo
{
    public static void main(String A[])
    {
       Scanner sobj = new Scanner(System.in);
        int iStd=0;

       System.out.println("Enter your Standard:");
        iStd=sobj.nextInt();
        
        switch(iStd)
        {
           case 1:
            System.out.println("exam at 9AM ");
            break;

            case 2:
            System.out.println("exam at 10AM ");
            break;

            case 3:
            System.out.println("exam at 11AM ");
            break;

             case 4:
            System.out.println("exam at 12AM ");
            break;
            
        

            default:
             System.out.println("invalid standard ");
            


        }
           

    }
}