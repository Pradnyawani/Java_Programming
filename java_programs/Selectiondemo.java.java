imort java.util.Scanner;

class Selectiondemo
{
    public static void main(String A[])
    {
       Scanner sobj = new Scanner(System.in);
        int iNo=0;

       Syestem.out.println("Enter your Age:");
        iNo=sobj.nextInt();
        

        if(iNo >=18)
        {
            System.out.println("you can vote");

        }
        else{
           System.out.println("you cant vote");

        }


    }
}