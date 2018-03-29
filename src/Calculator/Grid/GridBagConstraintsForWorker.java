package Calculator.Grid;

import java.awt.*;

public class GridBagConstraintsForWorker extends GridBagConstraints {
    public GridBagConstraintsForWorker(){
        anchor = GridBagConstraints.CENTER;
        fill   = GridBagConstraints.NONE;
        gridheight = 1;
        gridwidth  = 1;
        gridx = 0;
        gridy = 1;
        insets = new Insets(0, 0, 0, 60);
        ipadx = 0;
        ipady = 0;
        weightx = 0.0;
        weighty = 0.0;
    }
}
