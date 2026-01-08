
interface demo
{
    int No=11;
    void Display();
}

 class Hello implements demo
{
    public void Display()
    {
        System.out.println("inside Display");
    }
}



class Interfacedemo3
{
    public static void main(String A[])
    {
        System.out.println(demo.No);   //no is public,static
        //demo.No=12;                    //no is final
        Hello hobj = new  Hello();  //error
        hobj.Display();
    }
}