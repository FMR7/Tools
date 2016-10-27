package master;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Fernando on 27/10/2016.
 */
public class crackHashTest {
    @Test
    public void crackHashNumeric() throws Exception {
        boolean ini1 = new crackHash().crackHashNumeric(3, "MD5", "cee631121c2ec9232f3a2f028ad5c89b");
        boolean end1 = true;
        assertEquals(end1, ini1);

        boolean ini2 = new crackHash().crackHashNumeric(3, "MD5", "fakehash1c2ec9232f3a2f028ad5c89b");
        boolean end2 = false;
        assertEquals(end2, ini2);
    }

    @Test
    public void crackHashNumericBetweenTwoValues() throws Exception {
        boolean ini1 = new crackHash().crackHashNumeric(1, 3, "MD5", "cee631121c2ec9232f3a2f028ad5c89b");
        boolean end1 = true;
        assertEquals(end1, ini1);

        boolean ini2 = new crackHash().crackHashNumeric(1, 3, "MD5", "fakehash1c2ec9232f3a2f028ad5c89b");
        boolean end2 = false;
        assertEquals(end2, ini2);
    }

}