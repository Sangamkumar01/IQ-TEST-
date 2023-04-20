import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(new Color(175, 175, 255));
        setLayout(null);

        JLabel heading = new JLabel("WELCOME " + name + " to LPU IQ TEST");
        heading.setBounds(400, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 80, 700, 500);
        rules.setFont(new Font("Algerian", Font.PLAIN, 16));
        rules.setText(
                "<html>" +
                        "1. You must use a functioning webcam and microphone" + "<br><br>" +
                        "2. Your desk/table must be clear or any materials except your test-taking device"
                        + "<br><br>" +
                        "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>"
                        +
                        "4. Level Wise Result Predictor " + "<br><br>"
                        + "1> Score=25 Your Mental Age : 8-10 " + "feeble-mindedness or low IQ " + "<br><br>" +
                        "2> Score=50 Your Mental Age : 10-15 " + "Extremely poor intelligence." + "<br><br>" +
                        "3> Score=75 Your Mental Age : 50-65 " + "At Par intelligence. " + "<br><br>" +
                        "4> Score=100 Your Mental Age : 22-30 " + "Average IQ. " + "<br><br>" +
                        "5> Score=125 Your Mental Age : 30-35 " + "Above Average IQ. " + "<br><br>" +
                        "6> Score=150 Your Mental Age : 35+ " + "Man ! Your At Einstein Level" + "<br><br>" +
                        "<html>");

        add(rules);

        back = new JButton("Back");
        back.setBounds(800, 470, 100, 30);
        back.setBackground(new Color(239, 62, 91));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(800, 100, 100, 30);
        start.setBackground(new Color(0, 0, 122));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}