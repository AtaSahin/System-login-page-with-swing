 
import javax.swing.*;

import java.awt.*;


class NewPage extends JFrame
{
    JButton b2;
   
    NewPage()

    {
        b2=new JButton("Here");
        b2.setLocation(123,143);// under development...New button will be added to the second page of the program.

        setDefaultCloseOperation(javax.swing.
                WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome");
        setSize(400, 200);

    }
}  