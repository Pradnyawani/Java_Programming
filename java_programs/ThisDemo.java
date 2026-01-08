class Demo
{
        public int i;
        public static int j;

        static    //static block 
        {
            j=21;
        }

        public Demo()
        {
            
             System.out.println(" inside default");
             this.i=11;                                //first use
        }

        public Demo(int a)
        {
            this();                                   //second use
            System.out.println(" inside parameterized");
            
        }

        public void Display()
        {
            System.out.println("inside Display"+this.i);//third use
        }
}


class ThisDemo
{
    public static void main(String A[])
    {
        Demo dobj=new Demo(51);
        dobj.Display();
    }
}