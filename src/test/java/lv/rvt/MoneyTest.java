package lv.rvt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import rvt.Money;

public class MoneyTest {

    @Test
    public void testPlusMethode() {

        Money macins1 = new Money(10, 10);
        Money macins2 = new Money(5, 90);
        Money macins3 = macins1.plus(macins2);
        assertEquals(16, macins3.euros());
        assertEquals(0, macins3.cents());
    }

    @Test
    public void testLessThan() {
        Money macins1 = new Money(10, 10);
        Money macins2 = new Money(5, 90);
        assertFalse(macins1.lessThan(macins2));
        assertTrue(macins2.lessThan(macins1));

    }
}
