package master;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Fernando on 19/10/2016.
 */
public class hashesTest {

    @Test
    public void getMD5() throws Exception {
        String ini1 = new hashes().getMD5("");
        String end1 = "d41d8cd98f00b204e9800998ecf8427e";
        assertEquals(end1, ini1);

        String ini2 = new hashes().getMD5(" ");
        String end2 = "7215ee9c7d9dc229d2921a40e899ec5f";
        assertEquals(end2, ini2);

        String ini3 = new hashes().getMD5("test");
        String end3 = "098f6bcd4621d373cade4e832627b4f6";
        assertEquals(end3, ini3);
    }

    @Test
    public void getSHA1() throws Exception {
        String ini1 = new hashes().getSHA1("");
        String end1 = "da39a3ee5e6b4b0d3255bfef95601890afd80709";
        assertEquals(end1, ini1);

        String ini2 = new hashes().getSHA1(" ");
        String end2 = "b858cb282617fb0956d960215c8e84d1ccf909c6";
        assertEquals(end2, ini2);

        String ini3 = new hashes().getSHA1("test");
        String end3 = "a94a8fe5ccb19ba61c4c0873d391e987982fbbd3";
        assertEquals(end3, ini3);
    }

    @Test
    public void getSHA256() throws Exception {
        String ini1 = new hashes().getSHA256("");
        String end1 = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
        assertEquals(end1, ini1);

        String ini2 = new hashes().getSHA256(" ");
        String end2 = "36a9e7f1c95b82ffb99743e0c5c4ce95d83c9a430aac59f84ef3cbfab6145068";
        assertEquals(end2, ini2);

        String ini3 = new hashes().getSHA256("test");
        String end3 = "9f86d081884c7d659a2feaa0c55ad015a3bf4f1b2b0b822cd15d6c15b0f00a08";
        assertEquals(end3, ini3);
    }

    @Test
    public void getSHA384() throws Exception {
        String ini1 = new hashes().getSHA384("");
        String end1 = "38b060a751ac96384cd9327eb1b1e36a21fdb71114be07434c0cc7bf63f6e1da274edebfe76f65fbd51ad2f14898b95b";
        assertEquals(end1, ini1);

        String ini2 = new hashes().getSHA384(" ");
        String end2 = "588016eb10045dd85834d67d187d6b97858f38c58c690320c4a64e0c2f92eebd9f1bd74de256e8268815905159449566";
        assertEquals(end2, ini2);

        String ini3 = new hashes().getSHA384("test");
        String end3 = "768412320f7b0aa5812fce428dc4706b3cae50e02a64caa16a782249bfe8efc4b7ef1ccb126255d196047dfedf17a0a9";
        assertEquals(end3, ini3);
    }

    @Test
    public void getSHA512() throws Exception {
        String ini1 = new hashes().getSHA512("");
        String end1 = "cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e";
        assertEquals(end1, ini1);

        String ini2 = new hashes().getSHA512(" ");
        String end2 = "f90ddd77e400dfe6a3fcf479b00b1ee29e7015c5bb8cd70f5f15b4886cc339275ff553fc8a053f8ddc7324f45168cffaf81f8c3ac93996f6536eef38e5e40768";
        assertEquals(end2, ini2);

        String ini3 = new hashes().getSHA512("test");
        String end3 = "ee26b0dd4af7e749aa1a8ee3c10ae9923f618980772e473f8819a5d4940e0db27ac185f8a0e1d5f84f88bc887fd67b143732c304cc5fa9ad8e6f57f50028a8ff";
        assertEquals(end3, ini3);
    }
}