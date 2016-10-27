package master;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Fernando on 27/10/2016.
 */
public class hashesSwitchTest {
    @Test
    public void hashSwitch() throws Exception {
        String ini1 = new hashesSwitch().hashSwitch("", "MD5");
        String end1 = "d41d8cd98f00b204e9800998ecf8427e";
        assertEquals(end1, ini1);

        String ini2 = new hashesSwitch().hashSwitch("", "SHA1");
        String end2 = "da39a3ee5e6b4b0d3255bfef95601890afd80709";
        assertEquals(end2, ini2);

        String ini3 = new hashesSwitch().hashSwitch("", "SHA256");
        String end3 = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
        assertEquals(end3, ini3);

        String ini4 = new hashesSwitch().hashSwitch("", "SHA384");
        String end4 = "38b060a751ac96384cd9327eb1b1e36a21fdb71114be07434c0cc7bf63f6e1da274edebfe76f65fbd51ad2f14898b95b";
        assertEquals(end4, ini4);

        String ini5 = new hashesSwitch().hashSwitch("", "SHA512");
        String end5 = "cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e";
        assertEquals(end5, ini5);
    }

}