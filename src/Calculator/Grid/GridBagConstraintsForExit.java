package Calculator.Grid;

import java.awt.*;

public class GridBagConstraintsForExit extends GridBagConstraints {
    public GridBagConstraintsForExit(){
        anchor = GridBagConstraints.CENTER;
        fill   = GridBagConstraints.NONE;
        gridheight = 1;
        gridwidth  = 3;
        gridx = 0;
        gridy = 2;
        insets = new Insets(30, 0, 0, 0);
        ipadx = 0;
        ipady = 0;
        weightx = 0.0;
        weighty = 0.0;
    }
}
