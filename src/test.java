//import required classes and packages  
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;


{
    
    JButton b1;
    JButton b2;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    final JTextField  textField1, textField2;



    CreateLoginForm()
    {

        //create label for username   
        userLabel = new JLabel();
        userLabel.setText("Username");      
 
        textField1 = new JTextField(15);

        //create label for password  
        passLabel = new JLabel();
        passLabel.setText("Password");       

       
        textField2 = new JPasswordField(15);    

       
        b1 = new JButton("SUBMIT"); 



     
        newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(userLabel);    
        newPanel.add(textField1);   
        newPanel.add(passLabel);      
        newPanel.add(textField2);   
        newPanel.add(b1);           

   
        add(newPanel, BorderLayout.CENTER);

       
        b1.addActionListener(this);     
        setTitle("Company System");       

    }

   
    public void actionPerformed(ActionEvent ae)     
    {
        String userValue = textField1.getText();        
        String passValue = textField2.getText();        

        //check whether the credentials are authentic or not  
        if (userValue.equals("admin") && passValue.equals("sexy")) {  

            //create instance of the NewPage  
            NewPage page = new NewPage();

            //make page visible to the user  
            page.setVisible(true);

            //create a welcome label and set it to the new page  
            JLabel wel_label = new JLabel("Welcome to our company: "+userValue);
            page.getContentPane().add(wel_label);
            newPanel.add(b2);
            b2.getText();
        }
        else{
            //show error message  
            System.out.println("not an casual admin login"); //admin login info mentioned above:)
        }
    }
}  