import java.util.*;
import java.io.*;
import java.net.*;

class AdditionClient2
{
    public static void main(String A[])throws Exception
    {
        System.out.println("Client is Running...");


        Socket sobj=new Socket("localhost",2100);
        System.out.println(" server succesfully connected");

          DataInputStream diobj=new DataInputStream(sobj.getInputStream());
        DataOutputStream  oobj=new DataOutputStream(sobj.getOutputStream());
  }
}