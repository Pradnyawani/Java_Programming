import  java.util.*;  





class ExceptionDemo2
{

    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int iNo1=1,iNo2=0;
        float fAns=0.0f;

        System.out.println("enter first number:");
        iNo1=sobj.nextInt();

        System.out.println("enter second number:");
        iNo2=sobj.nextInt();

        fAns=(float)iNo1 /(float)iNo2;
        System.out.println("Divison is:"+fAns);


    }
}