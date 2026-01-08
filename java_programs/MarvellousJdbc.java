import java.sql.*;


class MarvellousJdbc
{
    public static void main(String A[])
    {
       try{
        //step 1:load the database driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        

        //step 2:connect the driver with database

        Connection cobj=DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA53","root","");

        //step 3:create statement class object 

        Statement sobj=cobj.createStatement();

        //step 4:execute the query

        ResultSet robj=sobj.executeQuery("Select * from student");

        //step 5:Display the result

        while(robj.next())
        {
            System.out.println("roll no:"+robj.getInt("rno"));
             System.out.println("name no:"+robj.getString("name"));
              System.out.println("city:"+robj.getString("city"));
               System.out.println("marks no:"+robj.getInt("marks"));
              


        }
        robj.close();
        sobj.close();
        cobj.close();

       }
       catch(Exception eobj)
       {
            System.out.println("Exception occured:"+eobj);
       }

    }
}