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
        Money macins4 = new Money(3, 90);
        Money result1 = macins4.plus(macins2);

        assertEquals(9, result1.euros()); assertEquals(80, result1.cents());
        assertEquals(16, macins3.euros()); assertEquals(0, macins3.cents());
    }

    @Test
    public void testLessThan() {
        Money macins1 = new Money(10, 10);
        Money macins2 = new Money(5, 90);

        assertFalse(macins1.lessThan(macins2));
        assertTrue(macins2.lessThan(macins1));
    }

    @Test
    public void testMinusMethod() {
        Money macins1 = new Money(5, 10);
        Money macins2 = new Money(6, 0);

        Money macins3 = macins1.minus(macins2);
        Money macins4 = macins2.minus(macins1);

        assertEquals(0, macins3.euros()); assertEquals(0, macins3.cents());
        assertEquals(0, macins4.euros()); assertEquals(90, macins4.cents());
    }

    @Test
    public void testEquals() {
        Money macins1 = new Money(5, 10);
        Money macins2 = new Money(6, 0);
        Money macins3 = new Money(6, 0);

        assertFalse(macins1.equals(macins2));
        assertTrue(macins2.equals(macins3));

        

    }

    @Test
    public void testEqualEuros() {
        Money macins1 = new Money(5, 10);
        Money macins2 = new Money(6, 0);
        Money macins3 = new Money(6, 10);

        assertFalse(macins1.equalEuros(macins2));
        assertTrue(macins2.equalEuros(macins3));
    }

    @Test
    public void testEqualCents() {
        Money macins1 = new Money(5, 10);
        Money macins2 = new Money(6, 0);
        Money macins3 = new Money(6, 10);

        assertFalse(macins1.equalCents(macins2));
        assertTrue(macins1.equalCents(macins3));
    }
}
