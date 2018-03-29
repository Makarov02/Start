package Calculator;

import Calculator.Grid.GridBagConstraintsForAdmin;
import Calculator.Grid.GridBagConstraintsForExit;
import Calculator.Grid.GridBagConstraintsForLabel;
import Calculator.Grid.GridBagConstraintsForWorker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrameUserSelection extends JFrame {
    FrameUserSelection(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        setContentPane(panel);

        GridBagLayout gridBagLayout = new GridBagLayout();
        panel.setLayout(gridBagLayout);


        JLabel label = new JLabel("Выберете пользователя");
        label.setHorizontalAlignment(JLabel.CENTER);
        GridBagConstraintsForLabel gridBagConstraintsForLabel = new GridBagConstraintsForLabel();
        gridBagLayout.setConstraints(label,gridBagConstraintsForLabel);
        panel.add(label);

        JButton buttonForWorker = new JButton("   Работник   ");
        buttonForWorker.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                FrameForWorker frameForWorker = new FrameForWorker();
            }
        });
        GridBagConstraintsForWorker gridBagConstraintsForWorker = new GridBagConstraintsForWorker();
        gridBagLayout.setConstraints(buttonForWorker,gridBagConstraintsForWorker);
        panel.add(buttonForWorker);

        JButton buttonForAdmin = new JButton("Администратор");
        buttonForAdmin.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                FrameForAdminPassword frameForAdmin = new FrameForAdminPassword();
            }
        });
        GridBagConstraintsForAdmin gridBagConstraintsForAdmin = new GridBagConstraintsForAdmin();
        gridBagLayout.setConstraints(buttonForAdmin,gridBagConstraintsForAdmin);
        panel.add(buttonForAdmin);

        JButton buttonForExit = new JButton("Выход");
        GridBagConstraintsForExit gridBagConstraintsForExit = new GridBagConstraintsForExit();
        gridBagLayout.setConstraints(buttonForExit,gridBagConstraintsForExit);
        buttonForExit.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(buttonForExit);


        setVisible(true);
    }
}
