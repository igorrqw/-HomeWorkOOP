package HomeWorkOOP.Homework6;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NumberButton {
    private String text;
    JTextField textField;

    public NumberButton(JTextField textField, String text) {
        this.text = text;
        this.textField = textField;
    }

    public JButton create() {
        JButton btn = new JButton(text);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = textField.getText() + btn.getText();
                textField.setText(number);
            }
        });
        btn.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn.setBounds(10, 191, 65, 54);

        return btn;
    }

}
