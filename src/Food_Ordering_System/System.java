package Food_Ordering_System;

import javax.swing.*;

public class System extends JFrame{
    private JPanel panel1;
    private JCheckBox pizzaCB;
    private JRadioButton noneRB;
    private JCheckBox burgerCB;
    private JCheckBox friesCB;
    private JCheckBox softDrinksCB;
    private JCheckBox teaCB;
    private JCheckBox sundaeCB;
    private JRadioButton a5RB;
    private JRadioButton a10RB;
    private JRadioButton a15RB;
    private JButton order;

    System() {
        order.addActionListener(e -> {
            double total = 0;
            double discounted_price = 0;
            if(pizzaCB.isSelected()) {
                total += 100;
            }
            if(burgerCB.isSelected()) {
                total += 80;
            }
            if(friesCB.isSelected()) {
                total += 65;
            }
            if(softDrinksCB.isSelected()) {
                total += 55;
            }
            if(teaCB.isSelected()) {
                total += 50;
            }
            if(sundaeCB.isSelected()) {
                total += 40;
            }

            if(noneRB.isSelected()) {
                discounted_price = total;
            } else if(a5RB.isSelected()) {
                discounted_price = total * 0.95;
            } else if(a10RB.isSelected()) {
                discounted_price = total * 0.90;
            } else if(a15RB.isSelected()) {
                discounted_price = total * 0.85;
            }

            JOptionPane.showMessageDialog(null, "The total price is " + discounted_price);
            pizzaCB.setSelected(false);
            burgerCB.setSelected(false);
            friesCB.setSelected(false);
            softDrinksCB.setSelected(false);
            teaCB.setSelected(false);
            sundaeCB.setSelected(false);
            a15RB.setSelected(false);
            a10RB.setSelected(false);
            a5RB.setSelected(false);
            noneRB.setSelected(false);
        });
    }

    public static void main(String[] args) {
        System app = new System();

        app.setContentPane(app.panel1);
        app.setSize(600, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Food Ordering System");
    }
}
