package Calculator.Grid;

import java.awt.*;

public class GridBagConstraintsForAdmin extends GridBagConstraints {
    public GridBagConstraintsForAdmin(){
        anchor = GridBagConstraints.CENTER;
        fill   = GridBagConstraints.NONE;
        gridheight = 1;
        gridwidth  = 1;
        gridx = 2;
        gridy = 1;
        insets = new Insets(0, 60, 0, 0);
        ipadx = 0;
        ipady = 0;
        weightx = 0.0;
        weighty = 0.0;
    }
}
