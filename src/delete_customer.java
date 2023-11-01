import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class delete_customer extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    delete_customer(){
        super("Delete customer");
        setLocation(350,200);
        setSize(650,600);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(9,2,10,10));

        p.setBackground(Color.WHITE);

        l1 = new JLabel("Meter Number");
        t1 = new JTextField();
        p.add(l1);
        p.add(t1);
        

        b1 = new JButton("Submit");
        b2 = new JButton("Cancel");

        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        p.add(b1);
        p.add(b2);
        setLayout(new BorderLayout());

        add(p,"Center");

        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("images/hicon1.jpg"));
        Image i3 = ic1.getImage().getScaledInstance(150, 280,Image.SCALE_DEFAULT);
        ImageIcon ic2 = new ImageIcon(i3);
        l8 = new JLabel(ic2);


        add(l8,"West");
        //for changing the color of the whole 
        getContentPane().setBackground(Color.WHITE);

        b1.addActionListener(this);
        b2.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae){

        String a = t1.getText();

        String q1 = "delete from emp where meter_no='"+a+"'";

        try{
            conn c1 = new conn();
            
            c1.s.executeUpdate(q1);
            JOptionPane.showMessageDialog(null,"deleted");
            this.setVisible(false);


        }catch(Exception ex){
            ex.printStackTrace();
        }

    }


    public static void main(String[] args){
        new new_customer().setVisible(true);
    }
}