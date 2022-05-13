import javax.swing.*;

public class page {
JFrame f;
JButton b1, b2, b3, b4, b5, b6;

void disppage() {
page ob = new page();
ob.f = new JFrame("Library System");

ob.b1 = new JButton("Add Books");
ob.b1.setBounds(120, 30, 150, 30);
ob.b1.setFocusable(false);

ob.b2 = new JButton("View Books");
ob.b2.setBounds(120, 70, 150, 30);
ob.b2.setFocusable(false);

ob.b3 = new JButton("Issue Book");
ob.b3.setBounds(120, 120, 150, 30);
ob.b3.setFocusable(false);

ob.b4 = new JButton("View issued Books");
ob.b4.setBounds(120, 170, 150, 30);
ob.b4.setFocusable(false);

ob.b5 = new JButton("Return Book");
ob.b5.setBounds(120, 220, 150, 30);
ob.b5.setFocusable(false);

ob.b6 = new JButton("Logout");
ob.b6.setBounds(145, 270, 100, 30);
ob.b6.setFocusable(false);

ob.f.add(ob.b1);
ob.f.add(ob.b2);
ob.f.add(ob.b3);
ob.f.add(ob.b4);
ob.f.add(ob.b5);
ob.f.add(ob.b6);
ob.f.setSize(400, 400);
ob.f.setLayout(null);
ob.f.setVisible(true);
}
}