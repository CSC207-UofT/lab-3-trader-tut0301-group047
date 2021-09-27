import org.junit.*;

import static org.junit.Assert.*;

public class DuckyTest {
    Ducky d;

    @Before
    public void setUp() throws Exception {
        d = new Ducky();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Ga!", d.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, d.getMaxSpeed());
    }


    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        d.downgradeSpeed();
        assertEquals(0, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(2000, d.getPrice());
    }

}