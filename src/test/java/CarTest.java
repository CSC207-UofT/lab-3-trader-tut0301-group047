import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    Car c;

    @Before
    public void setUp() throws Exception {
        c = new Car();
    }

    @Test
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(110, c.getMaxSpeed());
    }

    @Test
    public void TestDowngradeSpeed() {
        c.downgradeSpeed();
        assertEquals(90, c.getMaxSpeed());
    }

    @Test
    public void TestGetMaxSpeed() {
        assertEquals(100, c.getMaxSpeed());
    }

    @Test
    public void TestGetPrice() {
        assertEquals(1000, c.getPrice());
    }

    @Test
    public void TestGetPriceFast() {
        c.upgradeSpeed();
        assertEquals(1100, c.getPrice());
    }

    @Test
    public void TestGetPriceSlow() {
        c.upgradeSpeed();
        assertEquals(900, c.getPrice());
    }
}