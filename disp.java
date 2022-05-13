import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class disp implements ActionListener{
    JFrame display=new JFrame("Library System"); 
    JButton log,sign;
    public static void main(String[] args) {
        disp ob=new disp();
        
        ob.log=new JButton("LOGIN");
        ob.sign=new JButton("SIGN UP");
        ob.log.addActionListener(ob);
        ob.sign.addActionListener(ob);
        ob.log.setBounds(320,250,180,50);
        ob.sign.setBounds(320,350,180,50);
        ob.log.setFocusable(false);
        ob.sign.setFocusable(false);
        ob.display.setSize(800,600);
        ob.display.setLayout(null);

        JLabel lb=new JLabel("WELCOME TO LIBRARY SYSTEM");
        lb.setBounds(55,0,700,400);
        lb.setForeground(Color.red);
        lb.setFont(new Font(Font.SANS_SERIF,Font.BOLD,40));
        ob.display.add(lb);
        ob.display.add(ob.log);
        ob.display.add(ob.sign);



        ob.display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.display.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sign)
        {  
            signuppage s=new signuppage();
            display.dispose();
            s.signup();
        }
        else if(e.getSource()==log)
        {   
            loginpage l=new loginpage();
            display.dispose();
            l.logon();
        }
        
    }
}