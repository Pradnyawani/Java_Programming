import java.io.*;
import java.net.*;

class ChatClientLoop
{
    public static void main(String A[])throws Exception
    {



            Socket sobj =new Socket("localhost",5100);
            System.out.println("Client gets connected with server Succesfully");

              PrintStream pobj=new PrintStream(sobj.getOutputStream());
             BufferedReader bobj1=new BufferedReader(new InputStreamReader(sobj.getInputStream()));  
             BufferedReader bobj2=new BufferedReader(new InputStreamReader(System.in));  

             System.out.println("-----------------------------------------------------------------");
             System.out.println("--------------------Marvellous Client----------------------------");
              System.out.println("-----------------------------------------------------------------");

                String Str1=null,Str2=null;
                   System.out.println("Enter message for server :");
             while(!(Str1=bobj2.readLine()).equals("end"))
        {
            pobj.println(Str1);
            Str2=bobj1.readLine();
            System.out.println("Server says:"+Str2);
            System.out.println("Enter message for server :");
        }


            
    }
}