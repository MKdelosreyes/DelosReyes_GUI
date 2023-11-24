package LeapYear;

import javax.swing.*;

public class Leap extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JButton checkButton;

    Leap() {
        checkButton.addActionListener(e -> {
            int year = Integer.parseInt(textField1.getText());

            if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                JOptionPane.showMessageDialog(null, "Leap Year!");
            } else {
                JOptionPane.showMessageDialog(null, "Not a leap year...");
            }

            textField1.setText("");
        });
    }

    public static void main(String[] args) {
        Leap app = new Leap();

        app.setContentPane(app.panel1);
        app.setSize(400, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");
    }
}
