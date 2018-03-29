package Calculator;


import static org.junit.Assert.assertEquals;

public class FrameForAdminPasswordTest {

    @org.junit.Test
    public void password() {
        assertEquals(true,new FrameForAdminPassword().password("admin"));
    }
}