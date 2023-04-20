import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileWriter;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(new Color(175, 175, 255));
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(800, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 400, 1400, 250);
        add(image);
        int p = score * 25;
        JLabel heading = new JLabel("Thankyou " + name + " for giving IQ Test ");
        heading.setBounds(470, 30, 1200, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));

        heading.setBackground(new Color(0, 0, 153));
        heading.setForeground(Color.WHITE);

        add(heading);

        JLabel lblscore = new JLabel("Your score is " + p);
        lblscore.setBounds(380, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        lblscore.setForeground(new Color(255, 0, 0));
        add(lblscore);

        JButton submit = new JButton("Test Your Brain Again ");
        submit.setBounds(380, 270, 300, 30);
        submit.setBackground(new Color(17, 20, 92));
        submit.setForeground(new Color(255, 255, 0));
        submit.addActionListener(this);
        add(submit);

        setVisible(true);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    FileWriter fw = new FileWriter("login.txt", true);
                    fw.write(score + "\t");
                    fw.close();
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Saved Sucessfully ");
                    dispose();
                } catch (Exception e) {
                }
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}