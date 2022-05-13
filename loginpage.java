import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.sql.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class loginpage implements ActionListener{
JLabel l1,l2,l3,l4;
JTextField tf1,tf2;

JButton b;
JFrame fr;
void logon(){
loginpage ob=new loginpage();
ob.fr=new JFrame("Library System");
ob.l1=new JLabel();
ob.l3=new JLabel("Email ID : ");
ob.l4=new JLabel("Password : ");
ob.tf1=new JTextField();
ob.tf1.setBounds(160,50,200,30);
ob.tf2=new JTextField();
ob.tf2.setBounds(160,90,200,30);
ob.b=new JButton("Login");
ob.b.addActionListener(ob);
ob.b.setBounds(215,130,100,30);
ob.b.setFocusable(false);
ob.l1.setBounds(50,80,300,30);
ob.l3.setBounds(80,50,150,30);
ob.l4.setBounds(80,90,150,30);
ob.fr.setSize(500,300);
ob.fr.add(ob.b);
ob.fr.add(ob.tf1);
ob.fr.add(ob.tf2);
ob.fr.add(ob.l3);
ob.fr.add(ob.l4);

ob.fr.setLayout(null);

ob.fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
ob.fr.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
if(e.getSource()==b)
{
    String mail,pass;
    String dmail=new String();
    String dpass=new String();
try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vish", "root",
    "Vishal@2004");
    Statement st = con.createStatement();
    mail=tf1.getText();
    pass=tf2.getText();
    ResultSet rs= st.executeQuery("select email,password from student_library");
    while(rs.next())
    {
    dmail=rs.getString("email");
    dpass=rs.getString("password");
    if(mail.equalsIgnoreCase(dmail)&&pass.equals(dpass))
    {
        page object=new page();
        fr.dispose();
        object.disppage();
        return;
    }
}
   System.out.println("Check Credentials.");    
    
    st.close();
    con.close();
    } catch (Exception E){
    System.out.println(E);
    }
}
}
}