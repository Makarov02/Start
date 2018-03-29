package Calculator;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrameForAdminTest {

    @Test
    public void numberForButton() {
        assertEquals(1800,new FrameForAdmin().numberForButton(1,1));
    }
}