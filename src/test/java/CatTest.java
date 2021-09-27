import org.junit.*;

import static org.junit.Assert.*;


public class CatTest {
    Cat cat;

    @Before
    public void setUp() throws Exception {
        cat = new Cat("Ragdoll");
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Meow~", cat.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(500, cat.getPrice());
    }
}