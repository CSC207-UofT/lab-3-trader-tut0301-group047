import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersianCatTest {

    PersianCat p;

    @Before
    public void setUp() throws Exception {
        p = new PersianCat();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Meow!", p.sound());
    }


    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(5000, p.getPrice());
    }
}
