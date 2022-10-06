import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// import javax.swing.ImageIcon;
// import java.awt.Image;
// import java.io.IOException;
// import java.util.logging.Level;
// import java.util.logging.Logger;
// import javax.imageio.ImageIO;
// import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
// import javax.swing.UIManager;
// import java.util.ArrayList;
// import java.util.List
;

public class Registrar extends JPanel {

    static StudentBody students;

    public Registrar() {
        students = new StudentBody("Brandeis");
    }

    public static void main(String[] args) {

        Registrar g = new Registrar();
        JFrame window = new JFrame("Registrar");

        JPanel top = new JPanel();

        JPanel bottom = new JPanel();
        JPanel center = new JPanel();
        JPanel main = new JPanel();
        JLabel name = new JLabel("name");
        JLabel sage = new JLabel("sageID");
        JLabel year = new JLabel("year");
        JLabel info = new JLabel("Update: ");

        JTextField name1 = new JTextField("Aeri");
        JTextField sageID = new JTextField("111r");
        JTextField yearg = new JTextField("spr50");

        JButton remove = new JButton("remove student");
        JButton add = new JButton("add student");
        JButton search = new JButton("lookup student");
        JButton list = new JButton("list students in registrar");

        top.add(name);
        top.add(sage);
        top.add(year);
        top.add(name1);
        top.add(sageID);
        top.add(yearg);
        top.setBackground(new Color(0xF7B96E));

        center.add(info);
        center.add(list);
        center.setBackground(new Color(0xE6E6E6));

        bottom.add(add);
        bottom.add(remove);
        bottom.add(search);

        bottom.setBackground(new Color(0xF7B96E));

        main.setLayout(new BorderLayout());
        main.add(top, BorderLayout.PAGE_START);
        main.add(center, BorderLayout.CENTER);
        main.add(bottom, BorderLayout.PAGE_END);

        window.setContentPane(main);
        window.setTitle("Registrar");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(420, 300);
        window.setResizable(false);
        window.setLocation(100, 100);
        window.setVisible(true);

        remove.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Student l = new Student(name1.getText(), sageID.getText(), yearg.getText());
                students.removeStudent(l);
                info.setText(name1.getText() + " removed");

            }
        });
        add.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Student l = new Student(name1.getText(), sageID.getText(), yearg.getText());
                students.addStudent(l);
                info.setText(name1.getText() + " added");

            }
        });
        list.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                info.setText("List of Students: ");
                // String[] lines= new String [students.getList().size()];
                for (Student val : students.getList()) {
                    JLabel label = new JLabel(val.toString());
                    center.add(label);

                }

            }
        });
        search.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String id = sageID.getText();
                for (Student val : students.getList()) {

                    if (val.getSageID().equals(id)) {
                        name1.setText(val.getName());
                        yearg.setText(val.getGraduationYr());
                        info.setText(val.getName() + "'s student ID is " + val.getSageID()
                                + " and they are set to graduate " + val.getGraduationYr() + ".");
                    } else {
                        name1.setText(" ");
                        yearg.setText(" ");
                        info.setText("This student does not exist.");
                    }
                }
            }
        });

    }

}
