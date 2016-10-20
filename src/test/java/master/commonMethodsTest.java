package master;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Fernando on 20/10/2016.
 */
public class commonMethodsTest {
    @Test
    public void getMaxValue() throws Exception {
        String ini1 = new commonMethods().getMaxValue(5);
        String end1 = "99999";
        assertEquals(end1, ini1);

        String ini2 = new commonMethods().getMaxValue(8);
        String end2 = "99999999";
        assertEquals(end2, ini2);

        String ini3 = new commonMethods().getMaxValue(10);
        String end3 = "9999999999";
        assertEquals(end3, ini3);
    }

    @Test
    public void fillLeftZeros() throws Exception {
        String ini = "0123456789";
        String end = new commonMethods().fillLeftZeros("123456789", 10);
        assertEquals(end, ini);
    }

}