import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;



class ChatServerLoop
{
    public static void main(String A[])throws Exception
    {
        ServerSocket ssobj=new ServerSocket(5100);
        System.out.println("Server is waiting at port 5100");

        Socket sobj=ssobj.accept();
        System.out.println("Client Request gets Accepted Succesfully");

        PrintStream pobj=new PrintStream(sobj.getOutputStream());
        BufferedReader bobj1=new BufferedReader(new InputStreamReader(sobj.getInputStream()));  
        BufferedReader bobj2=new BufferedReader(new InputStreamReader(System.in)); 

        System.out.println("-----------------------------------------------------------------");
        System.out.println("--------------------Marvellous Server----------------------------");
        System.out.println("-----------------------------------------------------------------");

        String Str1=null,Str2=null;

       while((Str1=bobj1.readLine())!=null)
       {
        
        System.out.println("Client Says:"+Str1);
        System.out.println("Enter Message for Client:");
        Str2=bobj2.readLine();
        pobj.println(Str2);
       }

      }
}