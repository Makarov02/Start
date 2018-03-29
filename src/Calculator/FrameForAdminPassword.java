package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;



public class FrameForAdminPassword extends JFrame {
    FrameForAdminPassword(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200,200);
        setLocationRelativeTo(null);

        JPanel panelForFrameForAdminPassword = new JPanel();
        panelForFrameForAdminPassword.setLayout(new GridLayout(3,1,10,10));

        JLabel labelForPanelForFrameForAdmin = new JLabel("Введите пароль");
        labelForPanelForFrameForAdmin.setHorizontalAlignment(JLabel.CENTER);
        panelForFrameForAdminPassword.add(labelForPanelForFrameForAdmin);

        final JPasswordField passwordField = new JPasswordField();

        panelForFrameForAdminPassword.add(passwordField);

        JButton buttonForPanelForFrameForAdmin = new JButton("Вход");
        buttonForPanelForFrameForAdmin.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                if (password(String.valueOf(passwordField.getPassword()))==true) {
                    FrameForAdmin frameForAdmin = new FrameForAdmin();
                    dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null,"Вы ввели неправильный пароль");
                }

            }
        });
        panelForFrameForAdminPassword.add(buttonForPanelForFrameForAdmin);

        add(panelForFrameForAdminPassword);

        setVisible(true);
    }
    public boolean password(String PAS){
        return PAS.equals("admin");
    }
}
