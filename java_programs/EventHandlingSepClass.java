import javax.swing.*;
import java.awt.event.*;

class MarvellousListner implements ActionListener
{
    public void actionPerformed(ActionEvent aobj)
            {
                System.out.println("Button clicked...");
            }

}

class EventHandlingSepClass
{

    public static void main(String A[])
    {
        JFrame fobj=new JFrame("PPA");
        JButton bobj=new JButton("ok");

        bobj.setBounds(100,100,150,50);

        bobj.addActionListener(new MarvellousListner());
        MarvellousListner=new MarvellousListner;
        bobj.addActionListener(mobj);

        fobj.add(bobj);

        fobj.setSize(400,300);

        fobj.setLayout(null);
        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}