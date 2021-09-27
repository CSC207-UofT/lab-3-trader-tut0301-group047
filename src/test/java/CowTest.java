import org.junit.*;

import static org.junit.Assert.*;


public class CowTest {
    Cow c;

    @Before
    public void setUp() throws Exception {
        c = new Cow();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Moo!", c.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(2, c.getMaxSpeed());
    }

//    @Test(timeout = 50)
//    public void TestDowngradeSpeed() {
//        c.downgradeSpeed();
//        assertEquals(0, c.getMaxSpeed());
//    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10, c.getPrice());
    }

}
