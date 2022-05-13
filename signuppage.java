import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.sql.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signuppage implements ActionListener {
JLabel l1, l2, l3, l4, l5;
JTextField tf1, tf2, tf3, tf4, tf5;

JButton b;
JFrame fr;

void signup(){
signuppage ob = new signuppage();
ob.fr = new JFrame("Library System");

ob.l1 = new JLabel("Name : ");
ob.l1.setBounds(110, 50, 150, 30);
ob.tf1 = new JTextField();
ob.tf1.setBounds(160, 50, 200, 30);

ob.l2 = new JLabel("Course : ");
ob.l2.setBounds(100, 90, 150, 30);
ob.tf2 = new JTextField();
ob.tf2.setBounds(160, 90, 200, 30);

ob.l3 = new JLabel("E-mail : ");
ob.l3.setBounds(105, 130, 150, 30);
ob.tf3 = new JTextField();
ob.tf3.setBounds(160, 130, 200, 30);

ob.l4 = new JLabel("Password : ");
ob.l4.setBounds(85, 170, 150, 30);
ob.tf4 = new JTextField();
ob.tf4.setBounds(160, 170, 200, 30);

ob.l5 = new JLabel("Confirm Password : ");
ob.l5.setBounds(35, 210, 150, 30);
ob.tf5 = new JTextField();
ob.tf5.setBounds(160, 210, 200, 30);

// Sign Up button
ob.b = new JButton("Sign Up");
ob.b.addActionListener(ob);
ob.b.setBounds(215, 250, 100, 30);
ob.b.setFocusable(false);

ob.fr.setSize(450, 400);
ob.fr.add(ob.b);
ob.fr.add(ob.l1);
ob.fr.add(ob.l2);
ob.fr.add(ob.l3);
ob.fr.add(ob.l4);
ob.fr.add(ob.l5);
ob.fr.add(ob.tf1);
ob.fr.add(ob.tf2);
ob.fr.add(ob.tf3);
ob.fr.add(ob.tf4);
ob.fr.add(ob.tf5);

ob.fr.setLayout(null);

ob.fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
ob.fr.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
if (e.getSource() == b) {
    String name,course,email,pass;
    String rpass=new String();
    name=tf1.getText();
    course=tf2.getText();
    email=tf3.getText();
    pass=tf4.getText();
    rpass=tf5.getText();

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vish", "root",
        "Vishal@2004");
        Statement st = con.createStatement();
        if(pass.equals(rpass))
        {
            int n = st.executeUpdate("insert into student_library values(" +"'"+ name +"'"+ "," +"'"+ course +"'"+  ","+"'"+email+"'"+","+"'"+pass+"'"+")");
            System.out.println(n+" record inserted");
        }
        else
        System.out.println("PASSWORD IS NOT SAME PLEASE CHECK");
        
        
        st.close();
        con.close();
        } catch (Exception E) {
        System.out.println(E);
        }


}
}
}