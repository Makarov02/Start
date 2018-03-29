package Calculator;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrameForWorkerTest {

	@Test
    public void calculationsPaper() {
        assertEquals(2.0,new FrameForWorker().calculationsPaper("500","500"),0.001);
    }

    @Test
    public void calculationsCartridge() {
        assertEquals(1,new FrameForWorker().calculationsCartridge("500","1000"),0.001);
    }

    @Test
    public void calculationsLoad() {
        assertEquals(100,new FrameForWorker().calculationsLoad("10000","15000","Xerox Phaser 3020BI"),0.001);
    }
}