package Calculator;

import javax.swing.*;

public class Calculator extends JFrame{
    private JPanel panel1;
    private JTextField txtField1;
    private JTextField txtField2;
    private JTextField txtField3;
    private JComboBox cmbBox1;
    private JButton computeBtn;
    private JButton resetBtn;

    Calculator() {
        computeBtn.addActionListener(e -> {
            int num1 = Integer.parseInt(txtField1.getText());
            int num2 = Integer.parseInt(txtField2.getText());

            if(cmbBox1.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Choose valid operation!");
            } else if(cmbBox1.getSelectedIndex() == 1) {
                txtField3.setText(String.valueOf(num1 + num2));
            } else if(cmbBox1.getSelectedIndex() == 2) {
                txtField3.setText(String.valueOf(num1 - num2));
            } else if(cmbBox1.getSelectedIndex() == 3) {
                txtField3.setText(String.valueOf(num1 / num2));
            } else {
                txtField3.setText(String.valueOf(num1 * num2));
            }

//            resetBtn.addActionListener(b -> {
//                txtField1.setText("");
//                txtField2.setText("");
//                txtField3.setText("");
//                cmbBox1.setSelectedIndex(0);
//            });
        });

    }

    public static void main(String[] args) {
        Calculator app = new Calculator();

        app.setContentPane(app.panel1);
        app.setSize(700, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple Calculator");
    }
}
