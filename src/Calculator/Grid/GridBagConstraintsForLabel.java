package Calculator.Grid;

import java.awt.*;

public class GridBagConstraintsForLabel extends GridBagConstraints {
    public GridBagConstraintsForLabel(){
        anchor = GridBagConstraints.CENTER;
        fill   = GridBagConstraints.HORIZONTAL;
        gridheight = 1;
        gridwidth  = 3;
        gridx = 0;
        gridy = 0;
        insets = new Insets(0, 0, 30, 0);
        ipadx = 0;
        ipady = 0;
        weightx = 0.0;
        weighty = 0.0;
    }
}
