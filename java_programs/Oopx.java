class Arithmetic
{
    public int iNo1;
    public int iNo2;

    public  Arithmetic()
    {
      this.iNo1=0;
      this.iNo2=0;
    }

    public  Arithmetic(int i,int j)
    {
      this.iNo1=i;
      this.iNo2=j;  
    }
    public int Addition()
    {
        int iAns=0;
        iAns=this.iNo1+this.iNo2;
        return iAns;
    }
    public int Substraction()
    {
        int iAns=0;
        iAns=this.iNo1-this.iNo2;
        return iAns;
    }
    
}


class Oopx
{
    public static void main(String Arr[])
    {
       Arithmetic obj1 = new Arithmetic(11,10);

       int iRet=0;

       iRet=obj1.Addition();
       System.out.println("Addition is:"+iRet);

        iRet=obj1.Substraction();
       System.out.println("substraction is:"+iRet);

        obj1=null;
    }
}